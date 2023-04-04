package com.example.smarthome.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    notificationMessage: String,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .padding(top = 16.dp,start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xE13D3C3B),
                                Color.Transparent
                            ),
                            startY = 100f
                        )
                    )
            ){

            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.TopStart
            ){
                Column() {
                    Text(
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 22.sp
                        ),
                        text = title
                    )
                    Text(
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 18.sp
                        ),
                        text = notificationMessage
                    )
                }

            }
        }
    }
}