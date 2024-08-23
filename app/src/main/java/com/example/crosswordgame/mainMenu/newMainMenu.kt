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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import com.example.crosswordgame.ui.theme.MaragsaFont
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.lighterBrown
import com.example.crosswordgame.ui.theme.white

@Composable
fun MainMenuScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(modifier.fillMaxSize()) {

        // background image
        Image(painterResource(
            R.drawable.appbackgroundimg),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row( // game main menu logo
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painterResource(R.drawable.logo),
                contentDescription = "Main Menu logo",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .size(322.dp)
            )
        } // row #1 scope

        Column( // game buttons
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 152.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            MainMenuButtons(navController = navController)
        } // column #1 scope

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.End
        ) {
            SettingsAndSoundButton(navController = navController)
        }
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
                .height(100.dp)
                .width(290.dp),
            border = BorderStroke(
                width = 3.dp,
                color = Color.Black
            )
        ) {
            Text(
                stringResource(R.string.play_game),
                color = white,
                fontSize = 52.sp,
                fontFamily = MaragsaFont
            )
        }
        OutlinedButton( // game instructions button
            onClick = {  },
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
                stringResource(R.string.how2play),
                color = white,
                fontSize = 34.sp,
                fontFamily = MaragsaFont
            )
        }
        OutlinedButton( // Feedback button
            onClick = { navController.navigate(Screen.FeedbackOne.route) },
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
                stringResource(R.string.Feedback),
                color = white,
                fontSize = 34.sp,
                fontFamily = MaragsaFont
            )
        }
    }
}

@Composable
fun SettingsAndSoundButton(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var onSoundClick by remember { mutableStateOf(true) }

    val soundIcon = when (onSoundClick) {
        true ->  painterResource(id = R.drawable.baseline_volume_up_24)
        else -> painterResource(id = R.drawable.baseline_volume_off_24)
    }



    Column(
        modifier.padding(12.dp)
    ) {
        Surface(
            color = lighterBrown,
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, color = black)
        ) {
            IconButton(
                onClick = { navController.navigate(Screen.Settings.route)},
                modifier = Modifier.size(50.dp)
            ) {
                Icon(
                    Icons.Rounded.Settings,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    )
            }
        }
        Spacer(modifier = Modifier.padding(4.dp))
        Surface(
            color = lighterBrown,
            shape = RoundedCornerShape(50.dp),
            border = BorderStroke(2.dp, color = black)
        ) {
            IconButton(
                onClick = { onSoundClick = !onSoundClick},
                modifier = Modifier.size(50.dp)
            ) {
                Icon(
                    painter = soundIcon,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    )
            }
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