package com.example.fooddelivery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun Akcii() {
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
}