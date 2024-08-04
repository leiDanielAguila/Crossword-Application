package com.example.crosswordgame.mainMenu.feedback

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.toneBrown
import com.example.crosswordgame.ui.theme.white

@Composable
fun FeedbackScreenTwo(modifier: Modifier = Modifier, navController: NavController) {
    Box(modifier.fillMaxSize()) {
        Image(
            painterResource(
                R.drawable.appbackgroundimg),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            GiveFeedbackTwo()
        }

        Column(
            modifier
                .fillMaxSize()
                .padding(horizontal = 5.dp, vertical = 45.dp),
            horizontalAlignment = Alignment.End,
        ) {
            ExitButton(navController = navController)
        }

        Column( // Give Feedback card
            modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                color = darkerBrown,
                shape = RoundedCornerShape(20.dp),
                shadowElevation = 12.dp,
                modifier = Modifier.size(width = 200.dp, height = 70.dp)
            ) {
                Text(
                    stringResource(R.string.give_feedback),
                    color = white,
                    fontSize = 4.em,
                    modifier = Modifier.padding(horizontal = 13.dp, vertical = 18.dp)
                )
            }
        }
    }
}


@Composable
fun GiveFeedbackTwo() {
    Surface(
        color = darkerBrown,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.size(width = 360.dp, height = 750.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Surface (
                color = toneBrown,
                modifier = Modifier
                    .size(670.dp)
                    .padding(horizontal = 12.dp)
            ) {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedbackScreenTwoPreview() {
    FeedbackScreenTwo(navController = rememberNavController())
}