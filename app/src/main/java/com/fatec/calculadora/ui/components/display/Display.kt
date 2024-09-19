package com.fatec.calculadora.ui.components.display

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NumberDisplay(){
    Column(modifier = Modifier.fillMaxWidth()){
        Text(text="12+14",
            fontSize = 50.sp,
            letterSpacing = 5.sp,
            color = Color.White,
            textAlign = TextAlign.End,
            modifier = Modifier.background(color = Color.Black).padding(5.dp, 10.dp).fillMaxWidth())
        Text(text="26",
            fontSize = 35.sp,
            color = Color.Gray,
            textAlign = TextAlign.End,
            modifier = Modifier.background(color=Color.Black).padding(5.dp, 0.dp).fillMaxWidth())
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewDisplay(){
    NumberDisplay()
}