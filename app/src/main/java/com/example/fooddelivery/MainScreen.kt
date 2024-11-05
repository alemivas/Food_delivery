package com.example.fooddelivery

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.fooddelivery.components.AddressSearchBS

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MainScreen(
    modifier: Modifier = Modifier,
//    viewModel: MainViewModel
) {
    val viewModel: MainViewModel = viewModel()
//    val viewstate by viewModel.categoriesState

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



//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        when{
//            viewstate.loading -> {
//                CircularProgressIndicator(modifier.align(Alignment.Center))
//            }
//            viewstate.error != null ->{
//                Text("ERROR OCCURRED")
//            }
//            else ->{
//                LazyColumn(
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    items(viewstate.list){category ->
//                        Text(
//                            text = category.strCategory,
//                            color = Color.Black,
//                            fontWeight = FontWeight.Bold,
//                            modifier = Modifier.padding(top =4.dp)
//                        )
//                    }
//                }
//            }
//        }
//    }


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
                onClick = { /*TODO*/ }
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
                onQueryChange = {/* text ->
                    searchText.value = text
                    */},
                onSearch = {/*
                isActive.value = false
                viewModel.loadEverything(it)
                keyboardController?.hide()*/
                },
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
                active = /*isActive.value*/ false,
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

//        Промо разделы
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp/*, start = 15.dp, end = 15.dp*/)
            ,
            contentPadding = PaddingValues(start = 15.dp, end = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_1)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "Летний пикник",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_2)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "Летний обед",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_3)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "На завтрак",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_4)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "На ужин",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_1)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "Летний пикник",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_2)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "Летний обед",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .width(93.dp)
                        .fillMaxWidth()
                        .clickable {},
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_3)),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(/*horizontal = */8.dp)
                            .width(64.dp)
                            .height(64.dp),
                    )
                    Text(
                        text = "На завтрак",
                        color = Black,
                        lineHeight = 15.sp,
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }

//        Промо баннеры
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp)
            ,
            contentPadding = PaddingValues(start = 15.dp, end = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_1)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_2)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_1)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_2)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_1)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_2)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
            item {
                Card(
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .width(290.dp)
                            .height(115.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_banner_1)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(14.dp),
                            verticalArrangement = Arrangement.Bottom
                        ){
                            Text(
                                text = "В честь открытия",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 15.sp,
                                fontWeight = FontWeight(400),
                            )
                            Text(
                                text = "Скидки  20%",
                                color = White,
                                lineHeight = 25.sp,
                                fontSize = 25.sp,
                                fontWeight = FontWeight(800),
                            )
                        }
                    }
                }
            }
        }

//        Акции
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 31.dp)
            ,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp)
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Акции",
                    color = Black,
                    lineHeight = 20.sp,
                    fontSize = 25.sp,
                    fontWeight = FontWeight(400),
                )
                Button(
                    contentPadding = PaddingValues(vertical = 0.dp, horizontal = 10.dp),
                    modifier = Modifier
                        .width(115.dp)
                        .height(25.dp)
                    ,
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4F4F4))
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Text(
                            modifier = Modifier
                                .weight(1f),
                            text = "Смотреть все",
                            color = Black,
                            fontSize = 12.sp,
                            fontWeight = FontWeight(400),
                        )
                        Icon(
                            modifier = Modifier
                                .padding(0.dp)
                                .size(15.dp)
                            ,
                            imageVector = ImageVector.vectorResource(
                                R.drawable.baseline_keyboard_arrow_right_24
                            ),
                            tint = Color(0xFF717171),
                            contentDescription = null
                        )
                    }
                }
            }
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp)
                ,
                contentPadding = PaddingValues(start = 15.dp, end = 15.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_1)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_2)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_3)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_1)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_2)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_3)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
                item {
                    Card(
                        onClick = { /*TODO*/ }
                    ) {
                        Box(
                            modifier = Modifier
                                .width(102.dp)
                                .height(208.dp)
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.akcii_1)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(shape = RoundedCornerShape(12.dp)),
                                contentScale = ContentScale.Crop,
                            )
                        }
                    }
                }
            }
        }

//        Каталог
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 27.dp)
            ,
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp, end = 15.dp),
                text = "Каталог",
                color = Black,
                lineHeight = 20.sp,
                fontSize = 25.sp,
                fontWeight = FontWeight(400),
            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 30.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 17.dp, start = 15.dp, end = 15.dp)
                ,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_1)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_2)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_3)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 15.dp, end = 15.dp)
                ,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_4)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_5)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_6)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, start = 15.dp, end = 15.dp)
                ,
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_7)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_8)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .weight(1f)
                    ,
                    onClick = { /*TODO*/ }
                ) {
                    Box(
                        modifier = Modifier
                            .height(150.dp)
                    ) {
                        Image(
                            painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.catalog_9)),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(shape = RoundedCornerShape(12.dp)),
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//        MainScreen()
//}