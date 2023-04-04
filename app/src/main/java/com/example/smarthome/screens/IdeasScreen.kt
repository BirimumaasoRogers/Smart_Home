package com.example.smarthome.screens

import com.example.smarthome.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.smarthome.components.ImageCard

@Composable
fun IdeasScreen() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,

    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .shadow(5.dp)
                .height(50.dp)
                .background(color = Color(0xE1FFBF00)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ){
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 24.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    text = "My Smart Home"
                )
            }
        }
        Column (
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
            ){
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp)
                ) {
                    Text(
                        fontSize = 28.sp,
                        color = Color.DarkGray,
                        text = "More Recommendations"
                    )
                    Text(
                        fontSize = 18.sp,
                        color = Color.DarkGray,
                        text = "Even more recommendations!"
                    )
                }
            }
            Column {
                ImageCard(
                    painter = painterResource(id = R.drawable.ideas_image),
                    contentDescription = "Ideas Image",
                    title = "Thanksgiving Dinner is Ready",
                    notificationMessage = "Send me a notification",
                )

            }
        }
    }
}

@Preview
@Composable
fun PreviewIdeasScreen(){
    IdeasScreen()
}