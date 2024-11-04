package com.example.fooddelivery.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.fooddelivery.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddressSearchBS(
    onDismiss: () -> Unit,
    onValueSelected: (String) -> Unit
){
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
                },
                onSearch = {/*
                    isActive.value = false
                    viewModel.loadEverything(it)
                    keyboardController?.hide()*/
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
                active = /*isActive.value*/ false,
                onActiveChange = {
                }
            ) {
            }

            HorizontalDivider()

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp/*, start = 15.dp, end = 15.dp*/),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .clickable { onValueSelected("Текущее местоположение") },
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
                item {
                    Row(
                        modifier = Modifier
                            .clickable { onValueSelected("Ленина ул., 113") },
                        verticalAlignment =Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                            ,
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
                                text = "Ленина ул., 113"
                            )
                            Text(
                                text = "Ижевск, республика Удмуртия, Россия"
                            )
                        }

                    }
                }
                item {
                    Row(
                        modifier = Modifier
                            .clickable { onValueSelected("Пушкинская ул., 283") },
                        verticalAlignment =Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                            ,
                            imageVector = ImageVector.vectorResource(R.drawable.outline_location_on_24),
                            contentDescription = "SearchIcon",
                            tint = Color(0xFF717171)
                        )
                        Column(
                            modifier = Modifier
                                .padding(start = 18.dp)
                            ,
                        ) {
                            Text(
                                text = "Пушкинская ул., 283"
                            )
                            Text(
                                text = "Ижевск, республика Удмуртия, Россия"
                            )
                        }
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun Preview() {
//    AddressSearchBS()
//}