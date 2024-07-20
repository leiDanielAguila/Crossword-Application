package com.example.crosswordgame.games.movies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.crosswordgame.ui.theme.white

@Composable
fun MoviesGameTiles() {
    Surface(
        modifier = Modifier.size(width = 350.dp, height = 290.dp),
        color = Color.Transparent
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(12),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .fillMaxSize()

        ) {
            items(2){}
            item {// LETTER F
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(9){}
            items(11) { //FORREST GUMP
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            item{}
            items(2){}
            item {// LETTER O
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(3){}
            item {// LETTER I
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(5){}
            items(2){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(3){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(5){}
            items(2){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(3){}
            items(6) {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(2){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(3){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(5){}
            item{}
            items(8) {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
            items(3){}
            items(6){}
            item {
                Surface(
                    modifier = Modifier.size(width = 30.dp, height = 25.dp),
                    color = white
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "")
                    }
                }
            }
        }
    }
}