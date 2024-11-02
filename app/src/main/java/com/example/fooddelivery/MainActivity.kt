package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.ui.theme.FoodDeliveryTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val viewModel: CounterViewModel = viewModel()
            FoodDeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    /*Lazy*/Column(
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
//                modifier = Modifier
//                    .size(25.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    modifier = Modifier
//                        .size(19.dp, 17.dp),
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
//                    .height(36.dp)
                    .padding(start = 25.dp, end = 15.dp)
                    .clickable { }
            ) {
                Text(
                    text = "Доставка",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
//                    lineHeight = 20.sp,
                    color = Color(0xFF717171)
                )
                Row(
//                    modifier = Modifier
//                        .padding(top = (-5).dp)
//                    horizontalArrangement = Arrangement.spacedBy(16.dp),
//                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier
//                            .weight(1f)
//                            .background(Color.Red),
                    ) {
                        Text(

//                        text = "Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24 Пискунова, 24",
//                            text = "Пискунова, 24 gd dfsdfgds",
                            text = "Пискунова, 24",
                            fontSize = 16.sp,
                            fontWeight = FontWeight(400),
//                        lineHeight = 20.sp,
                            color = Color.Black
                        )
                    }
                    Column(
                        modifier = Modifier
//                            .size(25.dp)
//                            .weight(1f)
//                            .background(Color.Green),
                    )  {
                        Icon(
                            modifier = Modifier
                                .size(35.dp)
                                .padding(start = 5.dp),
//                        .size(19.dp, 17.dp),
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
//                .background(Color.Green)
//                .height(35.dp)
                ,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SearchBar(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .height(50.dp)
//                    .height(350.dp)
                    .offset(y = (-30).dp)
                ,
                shape = RoundedCornerShape(5.dp),
                colors = SearchBarDefaults.colors(containerColor = Color(0xFFF4F4F4)),
//                colors = SearchBarDefaults.colors(containerColor = Color.Cyan),
//                query = searchText.value,
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
//                            .padding(2.dp)
                        ,
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                        contentDescription = "SearchIcon",
                        tint = Color(0xFF717171)
                    )
                },
                placeholder = {
//                    Box(
//                        modifier = Modifier
////                            .height(100.dp)
////                            .padding(vertical = 0.dp)
//                            .background(Yellow),
//                    ) {
                        Text(
                            modifier = Modifier
//                            .height(50.dp)
//                            .padding(vertical = 0.dp)
//                                .background(Red)
                            ,
                            text = "Поиск товаров",
                            color = Color(0xFF717171),
//                        color = Red,
//                            fontFamily = inter,
                            lineHeight = 20.sp,
                            fontSize = 14.sp,
                            fontWeight = FontWeight(400),
                        )
//                    }

                },
                active = /*isActive.value*/ false,
                onActiveChange = {
                }
            ) {
            }
//            IconButton(
////                modifier = Modifier
////                    .size(25.dp),
//                onClick = { /*TODO*/ },
//                modifier = Modifier
//                    .size(30.dp)
//                    .background(Red, CircleShape),
////                contentAlignment = Alignment.Center
//            ) {
//                Icon(
//                    modifier = Modifier
////                        .size(19.dp, 17.dp),
//                        .size(15.dp),
//                    imageVector = ImageVector.vectorResource(
//                        R.drawable.heart
//                    ),
//                    tint = Color(0xFF717171),
//                    contentDescription = null
//                )
//            }
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(Color(0xFFF4F4F4), CircleShape)
                    .clickable { /*TODO*/ },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier
//                        .size(19.dp, 17.dp),
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
                .background(Red)
//                .horizontalScroll(rememberScrollState())
                ,
//            verticalAlignment = Align
            contentPadding = PaddingValues(start = 15.dp, end = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            item {
                Card(
                ) {
                    Box(
                        modifier = Modifier
                            .height(88.dp)
                            .width(80.dp)
                            .fillMaxWidth()
                            .clickable {},
//                        Alignment.TopCenter
//                        Arrangement.
                    ) {
                        Box(
                            modifier = Modifier
                                .height(64.dp)
                                .width(64.dp)
                                .padding(horizontal = 8.dp)
                                .fillMaxWidth(),
                            Alignment.TopCenter
                        ) {
                            Image(
                                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.promo_raz_1)),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
//                                .clip(shape = RoundedCornerShape(12.dp))
                                ,
                                contentScale = ContentScale.Crop,
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                    ,
                            Alignment.BottomCenter
                        ){
                            Text(
//                            modifier = Modifier
//                                .,

                                text = "Летний пикник"
                            )
                        }

                    }
                }
            }
//
//            Column {
////                    Image(painter = , contentDescription = )
//                Text(text = "Летний обед")
//            }
//            Column {
////                    Image(painter = , contentDescription = )
//                Text(text = "На завтрак")
//            }
//            Column {
////                    Image(painter = , contentDescription = )
//                Text(text = "На ужин")
//            }
//            Column {
////                Image(painter = , contentDescription = )
//                Text(text = "Летний пикник")
//            }
//            Column {
////                    Image(painter = , contentDescription = )
//                Text(text = "Летний обед")
//            }
//            Column {
////                    Image(painter = , contentDescription = )
//                Text(text = "На завтрак")
//            }
        }

//        Промо баннеры
        /*Lazy*/Row {
            Card(onClick = { /*TODO*/ }) {
            }
        }
//        Акции
        Column {
            Row {
                Text(text = "Акции")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Смотреть все")
                }
            }
            /*Lazy*/Row {
                Card(onClick = { /*TODO*/ }) {
//                    мо пока просто картинки
                }
            }
        }
//        Каталог
        Column {
            Text(text = "Каталог")
//            Grid
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        MainScreen()
}