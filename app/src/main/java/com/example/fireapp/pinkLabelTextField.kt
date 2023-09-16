package com.example.fireapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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
