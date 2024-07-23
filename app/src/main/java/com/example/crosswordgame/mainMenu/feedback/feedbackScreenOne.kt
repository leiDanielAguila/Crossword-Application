package com.example.crosswordgame.mainMenu.feedback

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
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.lighterBrown
import com.example.crosswordgame.ui.theme.toneBrown

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
            items(5) {
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

    }
}

@Preview(showBackground = true)
@Composable
fun FeedbackScreenPreview() {
    FeedbackScreen()
}