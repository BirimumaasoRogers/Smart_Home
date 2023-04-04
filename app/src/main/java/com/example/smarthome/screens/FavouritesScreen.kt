package com.example.smarthome.screens

import androidx.compose.foundation.background
import com.example.smarthome.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
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

@Composable
fun FavouritesScreen() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
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
                    .fillMaxWidth(0.8f),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 20.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    text = "My Smart Home"
                )
            }
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit Icon",
                tint = Color.White
            )
        }
        Column(
            modifier = Modifier
                .fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(

            ){
                Icon(
                    modifier = Modifier
                        .size(size = 128.dp),
                    painter = painterResource(id = R.drawable.ic_favorite),
                    tint = Color.Gray,
                    contentDescription = "Star Image"
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "No Favourites"
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Add your Favourite routines for easy access here"
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Tap the '+' button below to add your favourite routines"
            )

        }
        Row(
            modifier = Modifier
                .offset(0.dp, (-50).dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End
        ){
            Button(
                modifier = Modifier
                    .size(80.dp)
                    .padding(16.dp),
                shape = CircleShape,
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),
                elevation = ButtonDefaults.elevation(5.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    tint = Color.White,
                    contentDescription = "Add Favourites Icon"
                )
            }
        }
    }
}

@Preview
@Composable
fun FavouritesPreview() {
    FavouritesScreen()
}