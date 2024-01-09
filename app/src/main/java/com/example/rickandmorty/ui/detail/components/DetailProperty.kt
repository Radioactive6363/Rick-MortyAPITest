package com.example.rickandmorty.ui.detail.components

import androidx.compose.animation.expandVertically
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
//Propiedades de Detalles (Tamanio de texto, color, etc.)
fun DetailProperty(
    modifier: Modifier = Modifier,
    label: String,
    value: String?,
    imageVector: ImageVector
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 4.dp),
        elevation = 3.dp,
        backgroundColor = Color(0xffba2d65)
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Icon(
                imageVector = imageVector, 
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(Modifier.width(10.dp))
            Row {
                Text(text = label, fontWeight = FontWeight.Bold, color = Color.Cyan)
                Spacer(Modifier.width(70.dp))
                Text(text = value ?: "",fontWeight = FontWeight.Bold,  color = Color.White)
            }
        }
    }
}