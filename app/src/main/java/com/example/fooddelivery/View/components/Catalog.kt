package com.example.fooddelivery.View.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun Catalog (){
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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
                onClick = { Log.d ("Click", "Click") }
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