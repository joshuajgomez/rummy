package com.joshgm3z.rummy.model

import androidx.compose.ui.graphics.Color
import com.joshgm3z.rummy.R
import com.joshgm3z.rummy.ui.theme.Black10
import com.joshgm3z.rummy.ui.theme.Red10

enum class CardType(val icon: Int, val color: Color) {
    Spades(R.drawable.icon_spades, Black10),
    Diamonds(R.drawable.icon_diamonds, Red10),
    Clubs(R.drawable.icon_clubs, Black10),
    Hearts(R.drawable.icon_hearts, Red10),
}

data class CardInfo(
    val type: CardType,
    val value: Int,
) {
    val letter: String
        get() = when (value) {
            1 -> "A"
            11 -> "J"
            12 -> "Q"
            13 -> "K"
            else -> value.toString()
        }
}

fun cards(): MutableList<CardInfo> {
    val cards = mutableListOf<CardInfo>()
    CardType.entries.forEach { type ->
        for (i in 1..13) {
            cards.add(CardInfo(type, i))
        }
    }
    return cards
}