package com.fatec.calculadora.ui.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NumberButton(number: String){
    Button(onClick = {println(number)},
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(Color.Gray),
        modifier = Modifier.size(width = 90.dp, height = 90.dp)) {
        Text(text = number, fontSize = 25.sp)
    }
}

@Composable
fun OpButtons(op: String){
    Button(onClick = {println(op)},
        shape = RectangleShape,
        colors = ButtonDefaults.buttonColors(Color.DarkGray),
        modifier = Modifier.size(width = 90.dp, height = 90.dp)) {
        Text(text = op, fontSize = 25.sp)
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewNumberButton(){
    Row{
        NumberButton(number = "1")
        OpButtons(op = "+")
    }
}