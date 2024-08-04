package com.example.crosswordgame.mainMenu.feedback

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.ui.theme.AliceFont
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.darkestBrown
import com.example.crosswordgame.ui.theme.toneBrown

@Composable
fun FeedbackScreenThree(modifier: Modifier = Modifier, navController: NavController) {
    Box(modifier.fillMaxSize()) {
        Image(
            painterResource(R.drawable.appbackgroundimg),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ScreenThree()
        }
    }
}

@Composable
fun ScreenThree(modifier: Modifier = Modifier) {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = darkestBrown),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .size(width = 360.dp, height = 350.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Surface(
                color = toneBrown,
                shape = RoundedCornerShape(20.dp),
                shadowElevation = 12.dp,
                modifier = Modifier
                    .size(width = 340.dp, height = 330.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        stringResource(id = R.string.feedbackTyMessageOne),
                        color = Color.Black,
                        fontFamily = AliceFont,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(12.dp),
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenThreePreview() {
    FeedbackScreenThree(navController = rememberNavController())
}