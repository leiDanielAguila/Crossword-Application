package com.example.crosswordgame.selectOptions

import android.content.ClipData.Item
import android.graphics.Movie
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.crosswordgame.R
import com.example.crosswordgame.Screen
import com.example.crosswordgame.mainMenu.ReturnButton
import com.example.crosswordgame.ui.theme.black
import com.example.crosswordgame.ui.theme.brown
import com.example.crosswordgame.ui.theme.green
import com.example.crosswordgame.ui.theme.lighterBrown
import com.example.crosswordgame.ui.theme.red
import com.example.crosswordgame.ui.theme.yellow

@Composable
fun GameSelectionScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {

    Box(modifier.fillMaxSize()) {

        // background image
        Image(painterResource(
            R.drawable.appbackgroundimg),
            contentDescription = "Main Menu background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Row(
            modifier = Modifier.padding(top = 42.dp)
        ) {
            GameSelectionReturnButton(navController = navController)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 124.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item { MoviesCard(navController = navController) }
            }
        }
    }

}

@Composable
fun GameSelectionReturnButton(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Surface(
        modifier = modifier.padding(12.dp),
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesCard(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Card(
        onClick = { navController.navigate(Screen.Movies.route) },
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Image(
            painterResource(R.drawable.mt),
            contentDescription = "movie card",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(width = 268.dp, height = 181.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GameSelectionScreenPreview() {
    GameSelectionScreen(navController = rememberNavController())
}