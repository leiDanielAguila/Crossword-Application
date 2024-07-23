package com.example.crosswordgame.mainMenu

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.white


@Composable
fun SettingsScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Box(modifier.fillMaxSize()) {
        // background image
        Image(
            painterResource(
            R.drawable.homepagebackground),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OtherSettings()
        } // column #1 scope

        Column(
            modifier = modifier.padding(top = 44.dp)
        ) {
            ReturnButton(navController = navController)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview(modifier: Modifier = Modifier) {
    SettingsScreen(navController = rememberNavController())
}

@Composable
fun OtherSettings() {
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
                stringResource(R.string.credits),
                color = white,
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
                color = white,
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
                color = white,
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