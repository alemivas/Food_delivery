package com.example.fooddelivery.View.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun PromoSection() {
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
                    .clickable { Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
                    .clickable {Log.d ("Click", "Click")},
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
}