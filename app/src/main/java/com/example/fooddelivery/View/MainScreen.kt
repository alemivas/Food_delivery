package com.example.fooddelivery.View

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fooddelivery.R
import com.example.fooddelivery.View.components.AddressSearchBS
import com.example.fooddelivery.View.components.Akcii
import com.example.fooddelivery.View.components.Catalog
import com.example.fooddelivery.View.components.Menu
import com.example.fooddelivery.View.components.PromoBanners
import com.example.fooddelivery.View.components.PromoSection
import com.example.fooddelivery.ViewModel.MainViewModel
import kotlinx.coroutines.launch


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MainScreen(
    modifier: Modifier = Modifier,
) {
    val viewModel: MainViewModel = viewModel()

    val address = viewModel.address
    var showAddressSearchBS by remember { mutableStateOf(false) }
    if (showAddressSearchBS)
        AddressSearchBS(
            onDismiss = { showAddressSearchBS = false },
            onValueSelected = { value ->
                viewModel.updateAddress(value)
                showAddressSearchBS = false
            },
            viewModel = viewModel,
            modifier = Modifier,
        )

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = Color.White,
            ) {
                Menu()
            }
        },
        content={
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())

            ) {
//        гамбургер и адрес
                Row(
                    modifier = Modifier
                        .padding(top = 48.dp, start = 15.dp, end = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { scope.launch {drawerState.open()}  }
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(35.dp),
                            imageVector = ImageVector.vectorResource(
                                R.drawable.baseline_menu_24
                            ),
                            tint = Color(0xFF717171),
                            contentDescription = null
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 25.dp, end = 15.dp)
                            .clickable { showAddressSearchBS = true }
                    ) {
                        Text(
                            text = "Доставка",
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF717171)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(
                                modifier = Modifier
                            ) {
                                Text(
                                    text = address,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight(400),
                                    color = Black
                                )
                            }
                            Column(
                            )  {
                                Icon(
                                    modifier = Modifier
                                        .size(35.dp)
                                        .padding(start = 5.dp),
                                    imageVector = ImageVector.vectorResource(
                                        R.drawable.baseline_keyboard_arrow_down_24
                                    ),
                                    tint = Color(0xFF717171),
                                    contentDescription = null
                                )
                            }
                        }
                    }
                }
//        Поиск товаров
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, start = 15.dp, end = 15.dp)
                    ,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SearchBar(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                            .height(50.dp)
                            .offset(y = (-30).dp)
                        ,
                        shape = RoundedCornerShape(5.dp),
                        colors = SearchBarDefaults.colors(containerColor = Color(0xFFF4F4F4)),
                        query = "",
                        onQueryChange = {},
                        onSearch = {},
                        trailingIcon =  {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp)
                                ,
                                imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                                contentDescription = "SearchIcon",
                                tint = Color(0xFF717171)
                            )
                        },
                        placeholder = {
                            Text(
                                text = "Поиск товаров",
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
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .background(Color(0xFFF4F4F4), CircleShape)
                            .clickable { /*TODO*/ },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(15.dp),
                            imageVector = ImageVector.vectorResource(
                                R.drawable.heart
                            ),
                            tint = Color(0xFF717171),
                            contentDescription = null
                        )
                    }
                }

                PromoSection()

                PromoBanners()

                Akcii()

                Catalog()
            }
        }
    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//        MainScreen()
//}