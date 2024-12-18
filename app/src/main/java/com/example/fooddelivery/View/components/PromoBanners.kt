package com.example.fooddelivery.View.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun PromoBanners() {
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
}