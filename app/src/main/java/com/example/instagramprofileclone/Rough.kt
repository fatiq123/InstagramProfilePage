package com.example.instagramprofileclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Card() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .height(300.dp)
                .width(300.dp), elevation = 32.dp, shape = CardDefaults.outlinedShape
        ) {

            Row(
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp)
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.mypic),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(
                        text = "Fatiq Hussnain",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                    )
                    Text(
                        text = "fatiqhussnain1@gmail.com",
                        fontSize = 15.sp,
                        color = Color.Blue,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )
                    Text(
                        text = "03229549909",
                        fontSize = 15.sp,
                        color = Color.Blue,
                        modifier = Modifier.padding(start = 10.dp, top = 5.dp)
                    )
                }

            }
        }


    }
}


@Composable
fun BoxPractice() {
    Box() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Text(text = "Hello World")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    Card()
}

@Preview(showBackground = true)
@Composable
fun PreviewBoxPractice() {
    BoxPractice()
}