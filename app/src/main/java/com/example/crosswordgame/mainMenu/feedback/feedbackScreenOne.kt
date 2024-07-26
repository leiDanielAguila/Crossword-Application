package com.example.crosswordgame.mainMenu.feedback

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.crosswordgame.R
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.lighterBrown
import com.example.crosswordgame.ui.theme.toneBrown
import com.example.crosswordgame.ui.theme.white

@Composable
fun FeedbackScreen(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painterResource(
                R.drawable.homepagebackground),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GiveFeedbackOne()
        }

    }
}

@Composable
fun GiveFeedbackOne() {
    Surface(
        color = darkerBrown,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.size(width = 360.dp, height = 750.dp)
    ) {
        LazyColumn(
            modifier = Modifier.padding(top = 40.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            item {
                Surface (
                    color = toneBrown,
                    modifier = Modifier
                        .size(width = 380.dp, height = 130.dp)
                        .padding(horizontal = 12.dp)
                ) {

                }
            }
            items(4) {
                EmojiFeedbackSurface()
            }
        }
    }
}

@Composable
fun EmojiFeedbackSurface(modifier: Modifier = Modifier) {
    Surface (
        color = toneBrown,
        modifier = Modifier
            .size(width = 380.dp, height = 130.dp)
            .padding(horizontal = 12.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color.Transparent,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = white),
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {
                IconButton(
                    onClick = {  }, // emoji #1
                    modifier = Modifier.size(70.dp),
                    ) {
                    Icon(
                        painterResource(R.drawable.sad),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
            Surface(
                color = Color.Transparent,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = white),
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {
                IconButton(
                    onClick = {  }, // emoji #2
                    modifier = Modifier.size(70.dp),
                ) {
                    Icon(
                        painterResource(R.drawable.middle),
                        contentDescription = null,
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
            Surface(
                color = Color.Transparent,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = white),
                modifier = Modifier.padding(horizontal = 12.dp)
            ) {
                IconButton(
                    onClick = {  }, // emoji #3
                    modifier = Modifier.size(70.dp),
                ) {
                    Icon(
                        painterResource(R.drawable.happy),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedbackScreenPreview() {
    FeedbackScreen()
}