package com.example.crosswordgame.mainMenu

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.Navigation
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.CROSSWORDGAMETheme
import com.example.crosswordgame.ui.theme.brown

@Composable
fun MainMenuScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(modifier.fillMaxSize()) {

        // background image
        Image(painterResource(
            R.drawable.homepagebackground),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row( // game main menu logo
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painterResource(R.drawable.file),
                contentDescription = "Main Menu logo",
                modifier = Modifier.padding(top = 62.dp)
            )
        } // row #1 scope

        Column( // game buttons
            modifier = Modifier.fillMaxSize().padding(top = 52.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            MainMenuButtons(navController = navController)
        } // column #1 scope
    }
}


@Composable
fun MainMenuButtons(
    navController: NavController
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedButton( // play game button
            onClick = {
                navController.navigate(Screen.GameSelection.route)
                // buttonSound.start()
            },
            colors = ButtonDefaults.buttonColors(containerColor = brown),
            modifier = Modifier
                .padding(4.dp)
                .height(70.dp)
                .width(240.dp),
            border = BorderStroke(
                width = 3.dp,
                color = Color.Black
            )
        ) {
            Text(
                stringResource(R.string.play_game),
                fontSize = 36.sp
            )
        }
        OutlinedButton( // game instructions button
            onClick = {  },
            colors = ButtonDefaults.buttonColors(containerColor = brown),
            modifier = Modifier
                .padding(4.dp)
                .height(50.dp)
                .width(200.dp),
            border = BorderStroke(
                width = 3.dp,
                color = Color.Black
            )
        ) {
            Text(
                stringResource(R.string.how2play),
                fontSize = 24.sp
            )
        }
        OutlinedButton( // settings button
            onClick =  {
                navController.navigate(Screen.Settings.route)
            },
            colors = ButtonDefaults.buttonColors(containerColor = brown),
            modifier = Modifier
                .padding(4.dp)
                .height(50.dp)
                .width(200.dp),
            border = BorderStroke(
                width = 3.dp,
                color = Color.Black
            )
        ) {
            Text(
                stringResource(R.string.Settings),
                fontSize = 24.sp
            )
        }
        OutlinedButton( // Feedback button
            onClick = {  },
            colors = ButtonDefaults.buttonColors(containerColor = brown),
            modifier = Modifier
                .padding(4.dp)
                .height(50.dp)
                .width(200.dp),
            border = BorderStroke(
                width = 3.dp,
                color = Color.Black
            )
        ) {
            Text(
                stringResource(R.string.Feedback),
                fontSize = 24.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainMenuScreenPreview() {
    CROSSWORDGAMETheme {
        MainMenuScreen(navController = rememberNavController())
    }
}