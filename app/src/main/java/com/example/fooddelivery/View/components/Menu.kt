package com.example.fooddelivery.View.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

@Composable
fun Menu (){
    Column(
        modifier = Modifier
            .padding(top = 35.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .clickable {  },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = BitmapPainter(ImageBitmap.imageResource(R.drawable.myphoto)),
                contentDescription = "image",
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(start = 32.dp)
            ) {
                Text(
                    text = "Александр Васильев",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    color = Black
                )
                Text(
                    text = "+7 912 870-14-00",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                    color = Black
                )
            }
        }

        HorizontalDivider(
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Column(
            modifier = Modifier
                .padding(top = 24.dp, start = 16.dp, end = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .clickable {  },
            ) {
                Text(
                    text = "Оплата",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    color = Black
                )
                Text(
                    text = "Карта *4567",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF717171)
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Мои адреса",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Мои заказы",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Избранное",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Новости",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Купоны",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "О нас",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Пригласить друзей",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
            Text(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .clickable {  },
                text = "Настройки",
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Menu()
}