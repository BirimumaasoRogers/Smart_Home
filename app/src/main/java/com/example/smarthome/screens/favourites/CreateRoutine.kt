package com.example.smarthome.screens.favourites

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CreateRoutine(navController: NavController){
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
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){

                Button(
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFF9C632)),
                    elevation = ButtonDefaults.elevation(-(2.dp)),
                    onClick = {
//                        navController.navigate("create_routine")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Cancel Button",
                        tint = Color.White
                    )
                }

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 78.dp),
                    fontSize = 20.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    text = "Create a routine"
                )

                Button(
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterEnd)
                        .padding(end = 16.dp),
                    shape = CircleShape,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFF9C632)),
                    elevation = ButtonDefaults.elevation(-(2.dp)),
                    onClick = {
//                        navController.navigate("create_routine")
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Done,
                        contentDescription = "Done Button",
                        tint = Color.White
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ){
                var text by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    placeholder = {
                        Text(
                            color = Color.LightGray,
                            text = "Routine Name"
                        ) },
                    colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.Transparent)
                )
            }
            Column {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    fontSize = 18.sp,
                    text = "When"
                )
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(top = 12.dp, bottom = 12.dp),
                        textAlign = TextAlign.Center,
                        color = Color.DarkGray,
                        text = "Want this routine to run automatically? \n " +
                            "Add an event below"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        fontSize = 16.sp,
                        text = "Add Event"
                    )
                    Button(
                        modifier = Modifier
                            .size(80.dp)
                            .padding(16.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        elevation = ButtonDefaults.elevation(5.dp),
                        onClick = {
                            navController.navigate("create_routine")
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            tint = Color.White,
                            contentDescription = "Add Favourites Icon"
                        )
                    }
                }
            }
            Column {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    fontSize = 18.sp,
                    text = "Run these actions"
                )
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(top = 12.dp, bottom = 12.dp),
                        textAlign = TextAlign.Center,
                        color = Color.DarkGray,
                        text = "No actions. Tap below to add one"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Text(
                        fontSize = 16.sp,
                        text = "Add Action"
                    )
                    Button(
                        modifier = Modifier
                            .size(80.dp)
                            .padding(16.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue),
                        elevation = ButtonDefaults.elevation(5.dp),
                        onClick = {
                            navController.navigate("create_routine")
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            tint = Color.White,
                            contentDescription = "Add Favourites Icon"
                        )
                    }
                }
            }
            Column {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    fontSize = 18.sp,
                    text = "But only if"
                )
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxWidth()
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ){
                    Text(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(top = 12.dp, bottom = 12.dp),
                        textAlign = TextAlign.Center,
                        color = Color.DarkGray,
                        text = "Add an event before adding conditions"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun CreateRoutinePreview(){
    CreateRoutine(rememberNavController())
}