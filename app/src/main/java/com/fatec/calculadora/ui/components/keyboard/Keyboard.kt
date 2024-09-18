package com.fatec.calculadora.ui.components.keyboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fatec.calculadora.ui.components.buttons.EqualButton
import com.fatec.calculadora.ui.components.buttons.NumberButton
import com.fatec.calculadora.ui.components.buttons.OpButton

@Composable
fun Keyboard(){
    Column(
        verticalArrangement = Arrangement.spacedBy(3.dp),
        modifier = Modifier.padding(10.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            OpButton("CE")
            OpButton("C")
            OpButton("DEL")
            OpButton("/")
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            NumberButton("7")
            NumberButton("8")
            NumberButton("9")
            OpButton("x")
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            NumberButton("4")
            NumberButton("5")
            NumberButton("6")
            OpButton("-")
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            NumberButton("1")
            NumberButton("2")
            NumberButton("3")
            OpButton("+")
        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()) {
            OpButton(".")
            NumberButton("0")
            EqualButton()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewKey(){
    Keyboard()
}
