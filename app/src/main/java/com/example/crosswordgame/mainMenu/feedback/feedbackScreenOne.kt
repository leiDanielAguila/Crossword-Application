package com.example.crosswordgame.mainMenu.feedback

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.MaragsaFont
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.browner
import com.example.crosswordgame.ui.theme.darkerBrown
import com.example.crosswordgame.ui.theme.darkestBrown
import com.example.crosswordgame.ui.theme.toneBrown
import com.example.crosswordgame.ui.theme.white

@Composable
fun FeedbackScreen(modifier: Modifier = Modifier, navController: NavController) {
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
            GiveFeedbackOne(navController = navController)
        }
    }
}

@Composable
fun GiveFeedbackOne(navController: NavController) {
    ElevatedCard(
        colors = CardDefaults.cardColors(containerColor = darkestBrown),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .size(width = 360.dp, height = 750.dp)
    ) {
        ExitButton(navController = navController)
        SelectionCard()
        NextButton(navController = navController)
    }
}

@Composable
fun SelectionCard() {
    Surface(
        modifier = Modifier
            .size(width = 420.dp, height = 650.dp)
            .padding(8.dp),
        color = toneBrown
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            // modifier = Modifier.padding(vertical = 70.dp)
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                    Column {
                        Surface(
                            color = darkestBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(height = 50.dp, width = 140.dp)
                        ) {
                            Text(
                                stringResource(id = R.string.design),
                                color = white,
                                textAlign = TextAlign.Center,
                                fontSize = 22.sp,
                                fontFamily = MaragsaFont,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                } // row scope
                EmojiFeedbackSurface()
            } // column scope



            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                    Column {
                        Surface(
                            color = darkestBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(height = 50.dp, width = 140.dp)
                        ) {
                            Text(
                                stringResource(id = R.string.gameplay),
                                color = white,
                                textAlign = TextAlign.Center,
                                fontSize = 22.sp,
                                fontFamily = MaragsaFont,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                } // row scope
                EmojiFeedbackSurface()
            } // column scope


            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                    Column {
                        Surface(
                            color = darkestBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(height = 50.dp, width = 140.dp)
                        ) {
                            Text(
                                stringResource(id = R.string.mechanics),
                                color = white,
                                textAlign = TextAlign.Center,
                                fontSize = 22.sp,
                                fontFamily = MaragsaFont,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                } // row scope
                EmojiFeedbackSurface()
            } // column scope


            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                    Column {
                        Surface(
                            color = darkestBrown,
                            shape = RoundedCornerShape(10.dp),
                            modifier = Modifier.size(height = 50.dp, width = 140.dp)
                        ) {
                            Text(
                                stringResource(id = R.string.difficulty),
                                color = white,
                                textAlign = TextAlign.Center,
                                fontSize = 22.sp,
                                fontFamily = MaragsaFont,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    Surface(
                        color = darkestBrown,
                        modifier = Modifier
                            .size(width = 105.dp, height = 5.dp)
                            .fillMaxWidth()
                    ){}
                } // row scope
                EmojiFeedbackSurface()
            } // column scope

//            Surface(
//                modifier = Modifier
//                    .padding(top = 12.dp)
//                    .size(width = 180.dp, height = 50.dp)
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(10.dp),
//                color = darkestBrown
//            ) {
//                Text(
//                    stringResource(id = R.string.give_feedback),
//                    color = white,
//                    modifier = Modifier.padding(top = 8.dp),
//                    textAlign = TextAlign.Center,
//                    fontSize = 24.sp
//                )
//            }


//            Canvas(modifier = Modifier.size(width = 420.dp, height = 650.dp)) {
//                val strokeWidth = 3.dp.toPx()
//                val horizontalLines = 3
//                val sectionSize = size.height /  (horizontalLines + 1)
//                repeat(horizontalLines){ i ->
//                    val startY = sectionSize * (i + 1)
//                    drawLine(
//                        darkestBrown,
//                        start = Offset(0f, startY),
//                        end = Offset(size.width, startY),
//                        strokeWidth = strokeWidth
//                    )
//                }
//            }

//            Divider(thickness = 6.dp, color = darkestBrown)
//            EmojiFeedbackSurface()
//            Spacer(modifier = Modifier.padding(top = 3.dp))
//            Divider(thickness = 6.dp, color = darkestBrown)
//            Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.size(width = 420.dp, height = 650.dp)) {
//                Text(
//                    stringResource(id = R.string.give_feedback),
//                    color = white,
//                    modifier = Modifier.padding(top = 8.dp),
//                    textAlign = TextAlign.Center,
//                    fontSize = 24.sp
//                )
//
//                Text(
//                    stringResource(id = R.string.give_feedback),
//                    color = white,
//                    modifier = Modifier.padding(top = 8.dp),
//                    textAlign = TextAlign.Center,
//                    fontSize = 24.sp
//                )
//
//                Text(
//                    stringResource(id = R.string.give_feedback),
//                    color = white,
//                    modifier = Modifier.padding(top = 8.dp),
//                    textAlign = TextAlign.Center,
//                    fontSize = 24.sp
//                )
//
//                Text(
//                    stringResource(id = R.string.give_feedback),
//                    color = white,
//                    modifier = Modifier.padding(top = 8.dp),
//                    textAlign = TextAlign.Center,
//                    fontSize = 24.sp
//                )
//            }
        }
    }

}

@Composable
fun EmojiFeedbackSurface(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painterResource(R.drawable.feedbackbad),
                contentDescription = "reaction bad"
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painterResource(R.drawable.feedbackokay),
                contentDescription = "reaction okay"
            )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painterResource(R.drawable.feedbackgood),
                contentDescription = "reaction good"
            )
        }
    }
}


@Composable
fun ExitButton(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End
    ) {
        Surface(
            color = browner,
            border = BorderStroke(2.dp, black),
            shape = RoundedCornerShape(50.dp),
            modifier = Modifier
                .size(width = 90.dp, height = 50.dp)
                .padding(4.dp)

        ) {
            IconButton(
                onClick = { navController.navigate(Screen.MainMenu.route) },
            ) {
                Icon(
                    Icons.Rounded.Close,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp),
                    colorResource(R.color.btnBlack)
                )
            }
        }
    }
}

@Composable
fun NextButton(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
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


@Preview(showBackground = true, device = "id:pixel_5")
@Composable
fun FeedbackScreenPreview() {
    FeedbackScreen(navController = rememberNavController())
}