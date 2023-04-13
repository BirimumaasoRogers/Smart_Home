package com.example.smarthome.screens

import androidx.compose.foundation.background
import com.example.smarthome.R
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Person
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
fun SettingsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
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
                    fontSize = 20.sp,
                    color = Color.White,
                    style = MaterialTheme.typography.h1,
                    fontWeight = FontWeight.Bold,
                    text = "My Smart Home"
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Column{
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(16.dp)
                )
                {
                    Text(
                        fontSize = 20.sp,
                        color = Color.Gray,
                        text = "User Settings"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        imageVector = Icons.Rounded.Person,
                        tint = Color(0xE1FFBF00),
                        contentDescription = "User Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Moses"
                        )
                        Text(
                            fontSize = 16.sp,
                            color = Color.Gray,
                            text = "kmntanda@gmail.com"
                        )
                    }
                }
            }
            Column{
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(16.dp)
                )
                {
                    Text(
                        fontSize = 20.sp,
                        color = Color.Gray,
                        text = "Home Settings"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        imageVector = Icons.Rounded.Person,
                        tint = Color(0xE1FFBF00),
                        contentDescription = "User Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Accounts & Hubs"
                        )
                    }
                }
                Divider()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        painter = painterResource(id = R.drawable.users),
                        tint = Color(0xE1FFBF00),
                        contentDescription = "Clients Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Clients"
                        )
                    }
                }
                Divider()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        imageVector = Icons.Default.LocationOn,
                        tint = Color(0xE1FFBF00),
                        contentDescription = "Location Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Locations"
                        )
                    }
                }
            }
            Column{
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(16.dp)
                )
                {
                    Text(
                        fontSize = 20.sp,
                        color = Color.Gray,
                        text = "Voice"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        painter = painterResource(id = R.drawable.ic_voice),
                        tint = Color(0xE1FFBF00),
                        contentDescription = "Voice Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Voice Assistant"
                        )
                    }
                }
            }
            Column{
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(16.dp)
                )
                {
                    Text(
                        fontSize = 20.sp,
                        color = Color.Gray,
                        text = "App Permissions"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        imageVector = Icons.Default.Settings,
                        tint = Color.Gray,
                        contentDescription = "Notifications and App Permissions Icon"
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 16.dp)
                    ) {
                        Text(
                            fontSize = 18.sp,
                            text = "Notifications & Permissions"
                        )
                    }
                }
            }
        }

    }
}

@Preview
@Composable
fun SettingsScreenPreview(){
    SettingsScreen()
}