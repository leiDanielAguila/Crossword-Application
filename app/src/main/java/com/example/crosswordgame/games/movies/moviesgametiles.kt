package com.example.crosswordgame.games.movies

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.crosswordgame.ui.theme.white

@Composable
fun MoviesGameTiles() {
    Surface(
        modifier = Modifier.size(width = 350.dp, height = 290.dp),
        color = Color.Transparent

    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(8),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            items(2) {} // start of the first row

            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            items(3) {}
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item{}
            // first row finish


            items(2) {} // second row start
            item {// LETTER U
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER P
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            items(2) {} // end of 2nd row


            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            item{}
            // start of 3rd row
            item {// LETTER C
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            item{}

            item {// LETTER L
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            items (3) {}

            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            item{}
            // end of 3rd row
            // start of 4th row
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            item{}

            // end of 4th row

            // start of 5th row

            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            item{}

            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

            items(3){}
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count
            item{}
            // end of 5th row
            item {// LETTER M
                Surface(
                    modifier = Modifier.size(width = 40.dp, height = 35.dp),
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
            } // items count

        } // lazy vertical grid scope
    } // surface scope
} // composable scope

@Preview(showBackground = true)
@Composable
fun GameTilesPreview() {
    MoviesGameTiles()
}