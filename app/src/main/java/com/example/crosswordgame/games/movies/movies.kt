package com.example.crosswordgame.games

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.games.movies.MoviesGameTiles
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.darkBlue
import com.example.crosswordgame.ui.theme.lighterBrown
import com.example.crosswordgame.ui.theme.white

@Composable
fun GameLayout(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var backgroundImage by remember {
        mutableIntStateOf(1)
    }

    val imageResource = when(backgroundImage) {
        1 -> R.drawable.moviesbackgroundone
        2 -> R.drawable.moviesbackgroundtwo
        else -> R.drawable.moviesbackgroundthree
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painterResource(imageResource),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row( // MOVIES SCOREBOARD WHERE USER CAN SEE THE SCORE
            modifier = Modifier.padding(top = 100.dp)
        ) {
            Image(
                painterResource(R.drawable.moviescoreboard),
                contentDescription = "Movies Scoreboard",
                modifier = Modifier
                    .size(110.dp)
            )
        }

        Row( // TITLE BOARD OF THE SCREEN
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center
        ) {

            Image(
                painterResource(R.drawable.movietitleboard),
                contentDescription = "Movies Scoreboard",
                modifier = Modifier
                    .size(190.dp),
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalAlignment = Alignment.End,
        ) {

            Surface(
                // background changer button
                color = white,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = black),

                ) {
                IconButton(
                    onClick = {
                        if (backgroundImage == 3) {
                            backgroundImage = 1
                        } else {
                            backgroundImage++
                        }
                    },
                    modifier = Modifier.size(30.dp)
                ) {
                    Icon(
                        Icons.Rounded.Refresh,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Surface(

                color = white,
                shape = RoundedCornerShape(30.dp),
                border = BorderStroke(2.dp, color = black)
            ) {
                IconButton(
                    onClick = {
                        navController.navigate(Screen.GameSelection.route)
                    },
                    modifier = Modifier.size(30.dp)
                ) {
                    Icon(
                        Icons.Rounded.ExitToApp,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }

            }

            // game hints and info
            Surface(
                color = white,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = black)
            ) {
                IconButton(
                    onClick = { },
                    modifier = Modifier.size(30.dp)
                ) {
                    Icon(
                        Icons.Rounded.Info,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            // in-game settings
            Surface(
                color = white,
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = black)
            ) {
                IconButton(
                    onClick = { },
                    modifier = Modifier.size(30.dp)
                ) {
                    Icon(
                        Icons.Rounded.Settings,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        } 

        Column(
            modifier = Modifier
                .padding(top = 210.dp,)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            MoviesGameTiles()
        }
    }
}

@Composable
fun MoviesGameButtons(modifier: Modifier = Modifier) {
    
}


@Composable
fun MoviesScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    GameLayout(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun MoviesScreenPreview() {
    MoviesScreen(navController = rememberNavController())
}