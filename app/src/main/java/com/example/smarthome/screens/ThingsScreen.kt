package com.example.smarthome.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import com.example.smarthome.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
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
fun ThingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
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
                    .fillMaxWidth(0.6f),
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Black,
                    text = "My Smart Home"
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 30.dp)
                    .fillMaxWidth(0.4f),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search Icon",
                    tint = Color.White
                )
//                Spacer(
//                    modifier = Modifier
//                        .width(20.dp)
//                )
                Icon(
                    painter = painterResource(id = R.drawable.baseline_notes),
                    contentDescription = "Notes Icon",
                    tint = Color.White
                )
            }

        }
        Column(
            modifier = Modifier
                .fillMaxHeight(0.5f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(

            ){
                Image(
                    modifier = Modifier
                        .size(size = 128.dp),
                    painter = painterResource(id = R.drawable.things),
//                    tint = Color.Transparent,
                    contentDescription = "Things Image"
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "No Things!"
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Looks like we didn't discover any new devices"
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Try an option below"
            )

        }
        Divider(
            modifier = Modifier
                .offset(0.dp, (-30).dp)
                .padding(16.dp),
            color = Color.Gray,
            thickness = 2.dp
        )

        Column(
            modifier = Modifier
                .offset(0.dp, (-50).dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Button(
                    modifier = Modifier
                        .size(70.dp)
                        .padding(16.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    elevation = ButtonDefaults.elevation(5.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        tint = Color.White,
                        contentDescription = "Run Discovery"
                    )
                }
                Text(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    text = "Run Discovery"
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Button(
                    modifier = Modifier
                        .size(70.dp)
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
                        contentDescription = "Add a cloud account"
                    )
                }
                Text(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    text = "Add a Cloud Account"
                )
            }
            Row(
                modifier = Modifier
//                    .offset(0.dp, (-100).dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Button(
                    modifier = Modifier
                        .size(70.dp)
                        .padding(16.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    elevation = ButtonDefaults.elevation(5.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.more),
                        tint = Color.White,
                        contentDescription = "View our supported devices"
                    )
                }
                Text(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    text = "View our supported devices"
                )
            }
            Row(
                modifier = Modifier
//                    .offset(0.dp, (-100).dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                Button(
                    modifier = Modifier
                        .size(70.dp)
                        .padding(16.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    elevation = ButtonDefaults.elevation(5.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.mail),
                        tint = Color.White,
                        contentDescription = "Contact Support"
                    )
                }
                Text(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    text = "Contact Support"
                )
            }
        }
    }
}

@Preview
@Composable
fun ThingsScreenPreview(){
    ThingsScreen()
}