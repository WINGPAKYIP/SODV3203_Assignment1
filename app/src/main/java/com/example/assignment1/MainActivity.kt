package com.example.assignment1

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val androidGreen = Color(0xFFA4C639)
    val darkGreen = Color (0xFF00574B)
    Column(
        modifier = modifier
            .fillMaxSize()  // Make sure the Column fills the entire size
            .background(color = androidGreen),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.profilepic),
            contentDescription = null, // Content description for accessibility
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Wing Pak Yip",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Student",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = darkGreen
        )
        Spacer(modifier = Modifier.height(216.dp))
        Row(    verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .offset(x = 128.dp)
        ) {
            Icon(Icons.Default.Phone, contentDescription = "Phone Icon", tint = darkGreen)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "+1 123-456-7890",
                fontSize = 14.sp
            )
        }
        Row(    verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .offset(x = 128.dp)
        ) {
            Icon(Icons.Default.Person, contentDescription = "Social Media Icon", tint = darkGreen)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "@socialmediahandle",
                fontSize = 14.sp
            )
        }
        Row(     verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start)
                .offset(x = 128.dp)
        ) {
            Icon(Icons.Default.Email, contentDescription = "Email Icon", tint = darkGreen)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "example@example.com",
                fontSize = 14.sp
            )
        }
    }
}

//https://github.com/WINGPAKYIP/SODV3203_Assignment1.git

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Assignment1Theme {
        BusinessCard()
    }
}