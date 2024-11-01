package com.example.fooddelivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {
    /*Lazy*/Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
//        гамбургер и адрес
        Row {
            IconButton(onClick = { /*TODO*/ }) {
                
            }
            Column {
                Text(text = "Доставка")
                Row {
                    Text(text = "Пискунова, 24")
//                    Icon(imageVector = , contentDescription = )
                }
            }
        }
//        Поиск товаров
        Row {
//            SearchBar(query = , onQueryChange = , onSearch = , active = , onActiveChange = ) {
                IconButton(onClick = { /*TODO*/ }) {
                    
                }
        }
//        Промо разделы
        /*Lazy*/Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ) {
            Column {
//                Image(painter = , contentDescription = )
                Text(text = "Летний пикник")
            }
            Column {
//                    Image(painter = , contentDescription = )
                Text(text = "Летний обед")
            }
            Column {
//                    Image(painter = , contentDescription = )
                Text(text = "На завтрак")
            }
            Column {
//                    Image(painter = , contentDescription = )
                Text(text = "На ужин")
            }
            Column {
//                Image(painter = , contentDescription = )
                Text(text = "Летний пикник")
            }
            Column {
//                    Image(painter = , contentDescription = )
                Text(text = "Летний обед")
            }
            Column {
//                    Image(painter = , contentDescription = )
                Text(text = "На завтрак")
            }
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





        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
        Text(text = "cvncn")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        Greeting()
}