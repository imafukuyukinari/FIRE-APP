package com.example.fireapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fireapp.ui.theme.FIREAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FIREAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.padding(20.dp)
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
                                color = White,
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
                    Column(
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        bottomNavigation()
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pinkLabelTextField(
    label: String,
    value: String,
    onValueChange: (Int) -> Unit,
    placeholder: String,
    amount: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text(
            text = label,
            color = Color(0xFFF85F6A),
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.width(20.dp))
        TextField(
            value = value,
            onValueChange = {},
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            placeholder = {
                Text(
                    text = placeholder,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.width(180.dp)
                )
            },
            modifier = Modifier.width(180.dp),
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = amount,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun bottomNavigation() {
    val items = listOf(
        BottomNavigationItem.FullFire,
        BottomNavigationItem.SideFire,
        BottomNavigationItem.Simulation,
    )

    BottomNavigation(
        backgroundColor = White,
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = White,
                selected = false,
                onClick = {
                    //...
                }
            )
        }
    }
}