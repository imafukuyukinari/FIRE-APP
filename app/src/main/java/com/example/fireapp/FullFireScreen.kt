package com.example.fireapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FullFireScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "フルFIRE",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(30.dp))

        pinkLabelTextField(
            label = "毎月の生活費",
            onValueChange = {},
            placeholder = "25",
            value = "",
            amount = "万円"
        )

        pinkLabelTextField(
            label = "毎月の積立額",
            onValueChange = {},
            placeholder = "10",
            value = "",
            amount = "万円"
        )

        pinkLabelTextField(
            label = "資産運用利率",
            onValueChange = {},
            placeholder = "4",
            value = "",
            amount = "%"
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF85F6A)
            ),
        ) {
            Text(
                text = "計算する",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        // 計算結果表示テキスト
        Text(
            text = "FIREに必要な資産はXX万円です",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "XX歳で達成します",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Q. FIREの4%ルールとは？",
            textAlign = TextAlign.Left,
            color = Color.Gray,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.LightGray.copy(alpha = 0.3f))
                .padding(horizontal = 10.dp, vertical = 20.dp)
        ) {
            Text(
                text = "年間の生活費の25倍の資産を築き、" +
                        "その資産を年率4%で運用することで、" +
                        "資産が尽きることなく生活できるという考え方です。",
                color = Color.Gray,
            )
        }
    }
}
