package com.example.crosswordgame.mainMenu

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.ui.theme.brown
import kotlinx.serialization.Serializable


@Composable
fun BackgroundImage() {
    val backgroundImage = painterResource(R.drawable.homepagebackground)
    Image(
        painter = backgroundImage,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize(),  
    )
}

@Composable
fun MainMenu(
    navController: NavController
) {
    val context = LocalContext.current
    val homeViewLogo = painterResource(R.drawable.file)
    val buttonSound: MediaPlayer = MediaPlayer.create(context, R.raw.soundeffect)

    DisposableEffect(Unit) {
        onDispose {
            buttonSound.release()
        }
    }

    BackgroundImage()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = homeViewLogo,
            contentDescription = null,
            modifier = Modifier.padding(24.dp)
        )

        Spacer(modifier = Modifier.size(70.dp))
        OutlinedButton(
            onClick = {
                navController.navigate(Screen.GameSelection.route)
                buttonSound.start() },
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
        OutlinedButton(
            onClick = { buttonSound.start() },
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
        OutlinedButton(
            onClick =  {
                        buttonSound.start()
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
        OutlinedButton(
            onClick = { buttonSound.start() },
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

@Composable
@Preview(showBackground = true)
fun MainMenuPreview(modifier: Modifier = Modifier) {
    MainMenu(
        navController = rememberNavController()
    )
}


