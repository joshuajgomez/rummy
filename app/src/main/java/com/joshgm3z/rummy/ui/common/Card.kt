package com.joshgm3z.rummy.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joshgm3z.rummy.R
import com.joshgm3z.rummy.model.CardInfo
import com.joshgm3z.rummy.model.CardType
import com.joshgm3z.rummy.ui.theme.RummyTheme

@Preview
@Composable
private fun PreviewGameScreen() {
    RummyTheme {
        val cards = listOf(
            CardInfo(CardType.Spades, 1),
            CardInfo(CardType.Clubs, 1),
            CardInfo(CardType.Hearts, 1),
            CardInfo(CardType.Diamonds, 1),
        )
        Column {
            cards.forEach {
                Card(it)
            }
        }
    }
}


@Composable
fun Card(cardInfo: CardInfo) {
    Column(
        modifier = Modifier
            .width(60.dp)
            .height(80.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(color = Color.White)
            .padding(5.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                cardInfo.letter,
                fontSize = 25.sp,
                color = cardInfo.type.color,
            )
            Icon(
                painterResource(cardInfo.type.icon),
                contentDescription = "Card ${cardInfo.letter} of ${cardInfo.type.name}",
                tint = cardInfo.type.color,
                modifier = Modifier.size(25.dp),
            )
        }
        Icon(
            painterResource(cardInfo.type.icon),
            contentDescription = "Card ${cardInfo.letter} of ${cardInfo.type.name}",
            tint = cardInfo.type.color,
            modifier = Modifier.size(100.dp),
        )
    }
}

