package com.joshgm3z.rummy.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joshgm3z.rummy.model.cards
import com.joshgm3z.rummy.ui.common.Card
import com.joshgm3z.rummy.ui.theme.Pink40
import com.joshgm3z.rummy.ui.theme.RummyTheme

@Preview
@Composable
private fun PreviewGameScreen() {
    RummyTheme {
        GameScreen()
    }
}

@Composable
fun GameScreen() {
    Surface(color = Pink40) {
        LazyVerticalGrid(columns = GridCells.Fixed(5)) {
            items(cards()) {
                Surface(modifier = Modifier.padding(5.dp)) {
                    Card(it)
                }
            }
        }
    }
}

