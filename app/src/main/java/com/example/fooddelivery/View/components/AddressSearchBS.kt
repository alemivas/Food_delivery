package com.example.fooddelivery.View.components

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.Model.Data
import com.example.fooddelivery.ViewModel.MainViewModel
import com.example.fooddelivery.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddressSearchBS(
    onDismiss: () -> Unit,
    onValueSelected: (String) -> Unit,
    viewModel: MainViewModel,
    modifier: Modifier = Modifier,
){
    val viewstate by viewModel.suggestionsState

    val sheetState = rememberModalBottomSheetState()
    var searchText by remember { mutableStateOf("") }

    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        sheetState = sheetState,
        containerColor = Color.White,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 25.dp, start = 15.dp, end = 15.dp)
        ) {
            SearchBar(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = SearchBarDefaults.colors(containerColor = Color.White),
                query = searchText,
                onQueryChange = { text ->
                    searchText = text
                    viewModel.fetchSuggestions(searchText)
                },
                onSearch = {
//                    viewModel.fetchSuggestions()
                },
                leadingIcon =  {
                    Icon(
                        modifier = Modifier
                            .size(24.dp),
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                        contentDescription = "SearchIcon",
                        tint = Color(0xFF717171)
                    )
                },
                trailingIcon =  {
                    Icon(
                        modifier = Modifier
                            .size(24.dp),
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_close_24),
                        contentDescription = "CloseIcon",
                        tint = Color(0xFF717171)
                    )
                },
                placeholder = {
                    Text(
                        modifier = Modifier,
                        text = "Поиск адреса",
                        color = Color(0xFF717171),
                        lineHeight = 20.sp,
                        fontSize = 14.sp,
                        fontWeight = FontWeight(400),
                    )
                },
                active = false,
                onActiveChange = {
                }
            ) {
            }

            HorizontalDivider()

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .clickable {
                                onValueSelected("Текущее местоположение")
                                Log.d ("Click", "Click")
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .rotate(45f)
                            ,
                            imageVector = ImageVector.vectorResource(R.drawable.outline_navigation_24),
                            contentDescription = "SearchIcon",
                            tint = Color(0xFF717171)
                        )
                        Text(
                            modifier = Modifier
                                .padding(start = 18.dp)
                            ,
                            text = "Текущее местоположение"
                        )
                    }
                }
                when{
                    viewstate.loading -> {
                        Log.d("MyLog", "Loading")
                        item {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ){
                                CircularProgressIndicator(modifier.align(Alignment.Center))
                            }
                        }
                    }
                    viewstate.error != null -> {
                        Log.d("MyLog", viewstate.error.toString())
                        item {
                            Text("ERROR OCCURRED")
                        }
                    }
                    else -> {
                        Log.d("MyLog", "ok")

                        items(viewstate.list){suggestion ->
                            val streetHouseAddressString = makeStreetHouseAddressString(suggestion.data)
                            val cityAddressString = makeCityAddressString(suggestion.data)

                            Row(
                                modifier = Modifier
                                    .clickable {
                                        onValueSelected(streetHouseAddressString)
                                        Log.d ("Click", "Click")
                                    },
                                verticalAlignment =Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(24.dp),
                                    imageVector = ImageVector.vectorResource(R.drawable.outline_location_on_24),
                                    contentDescription = "LocationIcon",
                                    tint = Color(0xFF717171)
                                )
                                Column(
                                    modifier = Modifier
                                        .padding(start = 18.dp)
                                    ,
                                ) {
                                    Text(
                                        text = streetHouseAddressString,
                                        color = Color.Black,
                                        lineHeight = 20.sp,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight(400),
                                    )
                                    Text(
                                        text = cityAddressString,
                                        color = Color(0xFF717171),
                                        lineHeight = 20.sp,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight(400),
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun join(arr: Array<String>, separator: String = ", "): String {
    return arr.filter{it != null && it != "0" && it != "" }.joinToString(separator = separator)
}

fun makeStreetHouseAddressString(address:Data): String {
    return join(
        arrayOf(
            join(arrayOf(address.street_type, address.street), " "),
            join(arrayOf(address.house_type, address.house, address.block_type, address.block), " "),
        )
    )
}

fun makeCityAddressString(address:Data): String {
    return join(
        arrayOf(
            join(arrayOf(address.settlement_type, address.settlement), " "),
            if (address.city != address.region)
                join(arrayOf(address.city_type, address.city), " ")
            else "",
            join(arrayOf(address.area_type, address.area), " "),
            join(arrayOf(address.region_type, address.region), " "),
            address.country
        )
    )
}