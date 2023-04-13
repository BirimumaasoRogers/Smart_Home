package com.example.smarthome.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
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
import com.example.smarthome.R

@Composable
fun RoutinesScreen() {
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
                    fontWeight = FontWeight.Black,
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
            Box{
                Image(
                    modifier = Modifier
                        .size(size = 128.dp),
                    painter = painterResource(id = R.drawable.ic_restore_routines),
                    contentDescription = "Routine Image"
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "No Routines"
            )
            Text(
                modifier = Modifier
                    .padding(top = 20.dp),
                text = "Tap the '+' button below to get started"
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
                    contentDescription = "Add Routine"
                )
            }
        }
    }
}

@Preview
@Composable
fun RoutinesScreenPreview(){
    RoutinesScreen()
}