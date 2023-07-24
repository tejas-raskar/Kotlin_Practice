package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

        ArtworkDisplay(R.drawable.artwork)

        ArtworkNameAndArtist(artworkName = "Artwork", artistName = "Artist", year = 1999)

        //Prev and Next Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp)
                .wrapContentHeight(Alignment.Bottom),
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

// Artwork Display
@Composable
fun ArtworkDisplay(@DrawableRes artwork: Int) {

    Surface(
        modifier = Modifier
            .padding(32.dp)
            .padding(top = 32.dp, bottom = 32.dp),
        shadowElevation = 20.dp,
    ) {
        Image(
            painter = painterResource(artwork),
            contentDescription = null,
            modifier = Modifier.padding(32.dp)
        )
    }
}

//Artist Name
@Composable
fun ArtworkNameAndArtist(
    artistName: String,
    artworkName: String,
    year: Int
) {
    Surface(
        modifier = Modifier.padding(16.dp),
        shape = RoundedCornerShape(10.dp),
        color = Color.hsl(68F, 0.4F, 0.79F, 0.63F),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = artworkName,
                fontSize = 28.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "$artistName($year)",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    AppLayout()
}
