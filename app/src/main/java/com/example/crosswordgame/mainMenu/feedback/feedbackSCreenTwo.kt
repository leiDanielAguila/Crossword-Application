package com.example.crosswordgame.mainMenu.feedback

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.MaragsaFont
import com.example.crosswordgame.ui.theme.browner
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.darkestBrown
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
            GiveFeedbackTwo(navController = navController)
        }
    }
}


@Composable
fun GiveFeedbackTwo(
    onFeedbackQuestionOneChange: (String) -> Unit = {},
    onFeedbackQuestionTwoChange: (String) -> Unit = {},
    navController: NavController
) {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = darkestBrown),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .size(width = 360.dp, height = 750.dp)
    ) {
        ExitButton(navController = navController)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Surface (
                color = toneBrown,
                modifier = Modifier
                    .size(640.dp)
                    .padding(horizontal = 12.dp)
            ) {

                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(bottom = 32.dp)
                ) {

                    Column (horizontalAlignment = Alignment.CenterHorizontally) {
                        Surface(
                            color = darkestBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(height = 50.dp, width = 180.dp)
                        ) {
                            Text(
                                stringResource(id = R.string.give_feedback),
                                color = white,
                                textAlign = TextAlign.Center,
                                fontSize = 22.sp,
                                fontFamily = MaragsaFont,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Surface(
                            color = darkerBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.padding(horizontal = 12.dp)
                        ) {
                            Text(
                                stringResource(R.string.feedbackQuestion1),
                                fontFamily = MaragsaFont,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(horizontal = 16.dp)
                            )
                        }
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        TextField(
                            value = "",
                            onValueChange = onFeedbackQuestionOneChange,
                            singleLine = false,
                            shape = RoundedCornerShape(5.dp),
                            modifier = Modifier
                                .border(3.dp, darkestBrown, RoundedCornerShape(5.dp))
                                .size(width = 300.dp, height = 150.dp)
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Surface(
                            color = darkerBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.padding(horizontal = 12.dp)
                        ) {
                            Text(
                                stringResource(R.string.feedbackQuestion2),
                                fontFamily = MaragsaFont,
                                color = Color.White,
                                modifier = Modifier
                                    .padding(horizontal = 16.dp)
                            )
                        }
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        TextField(
                            value = "",
                            onValueChange = onFeedbackQuestionTwoChange,
                            singleLine = false,
                            shape = RoundedCornerShape(5.dp),
                            modifier = Modifier
                                .border(3.dp, darkestBrown, RoundedCornerShape(5.dp))
                                .size(width = 300.dp, height = 150.dp)
                        )
                    }
                }
            }
            NextAndReturnButton(navController = navController)
        }

    }
}

@Composable
fun NextAndReturnButton(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        Surface(
            color = browner,
            border = BorderStroke(3.dp, darkerBrown),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .size(width = 90.dp, height = 50.dp)
                .padding(4.dp)
        ) {
            IconButton(
                onClick = { navController.navigate(Screen.FeedbackOne.route) },
            ) {
                Icon(
                    Icons.Rounded.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                    colorResource(R.color.btnBlack)
                )
            }
        }

        Surface(
            color = browner,
            border = BorderStroke(3.dp, darkerBrown),
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .size(width = 90.dp, height = 50.dp)
                .padding(4.dp)
        ) {
            IconButton(
                onClick = { navController.navigate(Screen.FeedbackTwo.route) },
            ) {
                Icon(
                    Icons.Rounded.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                    colorResource(R.color.btnBlack)
                )
            }
        }
    }
}


@Composable
fun FeedbackPageTwoReturnButton(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {

    }
}
@Preview(showBackground = true)
@Composable
fun FeedbackScreenTwoPreview() {
    FeedbackScreenTwo(navController = rememberNavController())
}