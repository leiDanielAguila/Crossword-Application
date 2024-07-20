package com.example.crosswordgame.mainMenu

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.white
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.lighterBrown


@Composable
fun SettingsOptions(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier.padding(24.dp)
    ) {
        Spacer(modifier = Modifier.padding(16.dp))
        ReturnButton(navController = navController)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        ButtonsForSounds()
        Spacer(modifier = Modifier.padding(24.dp))
        OtherSettings()
    }

}

@Preview(showBackground = true)
@Composable
fun SettingOptionsPreview(modifier: Modifier = Modifier) {
    SettingsOptions(navController = rememberNavController())
}

@Composable
fun ButtonsForSounds(modifier: Modifier = Modifier) {
    var musicChecked by remember { mutableStateOf(true)  }
    var soundeffectsChecked by remember { mutableStateOf(true)  }
    Surface(
        color = brown,
        shadowElevation = 8.dp,
        shape = RoundedCornerShape(15.dp),
        border = BorderStroke(3.dp, color = black),
    ) {
        Row {
            Column {
                Text(
                    stringResource(id = R.string.music),
                    modifier.padding(12.dp),
                    fontSize = 8.em,
                    color = white,

                    )

                Text(
                    stringResource(id = R.string.sound_effects),
                    modifier.padding(12.dp),
                    fontSize = 8.em,
                    color = white
                )
            }
            Column {
                Switch(checked = musicChecked,
                    onCheckedChange = { musicChecked = it},
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = white,
                        checkedTrackColor = black,
                        uncheckedThumbColor = black,
                        uncheckedTrackColor = white,
                    ),
                    modifier = modifier.padding(8.dp)
                )
                Switch(checked = soundeffectsChecked,
                    onCheckedChange = { soundeffectsChecked = it},
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = white,
                        checkedTrackColor = black,
                        uncheckedThumbColor = black,
                        uncheckedTrackColor = white,
                    ),
                    modifier = modifier.padding(8.dp)
                )
            }
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun ButtonsPreview(modifier: Modifier = Modifier) {
//    ButtonsForSounds()
//}


@Composable
fun OtherSettings(modifier: Modifier = Modifier) {
    Column {
        OutlinedButton(
            onClick = { /*TODO*/ },
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
                stringResource(R.string.Language),
                fontSize = 24.sp
            )
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
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
                stringResource(R.string.terms_and_services),
                fontSize = 16.sp
            )
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
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
                stringResource(id = R.string.resetGame),
                fontSize = 24.sp
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun LanguageSettingPreview(modifier: Modifier = Modifier) {
//    OtherSettings()
//}

@Composable
fun ReturnButton(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = modifier.padding(8.dp),
        color = brown,
        shape = RoundedCornerShape(50.dp),
        border = BorderStroke(2.dp, color = black)
    ) {
        IconButton(
            onClick = { navController.navigate(Screen.MainMenu.route) },
            modifier = Modifier.size(60.dp)
        ) {
            Icon(
                Icons.Rounded.ArrowBack,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}