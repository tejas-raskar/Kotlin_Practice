package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme{
                AppLayout()
            }
        }
    }
}

@Composable
fun AppLayout() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Artwork Display
        Surface(
            modifier = Modifier.padding(32.dp).padding(top = 32.dp, bottom = 32.dp),
            shadowElevation = 20.dp,
        ) {
            Image(
                painter = painterResource(R.drawable.artwork),
                contentDescription = null,
                modifier = Modifier.padding(32.dp)
            )
        }

        //Artist Display Section
        Column(
            modifier = Modifier.padding(bottom = 32.dp)
        ) {
            Text(text = "Name of the Artwork")
            Text(text = "Artist Name (Year)")
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(32.dp).wrapContentHeight(Alignment.Bottom),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Button(onClick = {}) {
                Text(text = "Previous")
            }
            Button(onClick = {}) {
                Text(text = "Next")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    AppLayout()
}
