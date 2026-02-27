package com.alejandromoreno.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pantalla()
            PantallaDos()


                }
            }
        }
@Preview(showSystemUi = true)
@Composable
fun Pantalla(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxWidth()
            .padding(all = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Text(text = "Encabezado",
        modifier = Modifier
            .background(Color.Cyan)
            .padding(all = 10.dp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .padding(top = 10.dp, bottom = 10.dp, start = 50.dp, end = 50.dp ),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Item 1",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(all = 10.dp),
                textAlign = TextAlign.Start
            )
            Text(text = "Item 2",
                modifier = Modifier
                    .background(Color.Blue)
                    .padding(all = 10.dp),
                textAlign = TextAlign.Center
            )
            Text(text = "Item 3",
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(all = 10.dp),
                textAlign = TextAlign.End
            )
        }
        Text(text = "Pie de página",
            modifier = Modifier
                .background(Color.Red)
                .padding(all = 10.dp)
            )
    }
}
@Preview(showSystemUi = true)
@Composable
fun PantallaDos(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(all = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(R.drawable.gus)
        Image(
            painter = painter,
            contentDescription = "Gustavo Fring",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Gustavo Fring",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(modifier = Modifier,
            text = "Empresario y magnate, dueño de múltiples franquicias"
        )
    }

}
