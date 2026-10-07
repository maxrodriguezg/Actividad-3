package com.example.intento_dos.ui.components.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ContenedorIcono(
    icono: ImageVector,
    descripcion: String?,
    colorFondo: Color,
    colorIcono: Color,
    modifier: Modifier = Modifier,
    tamanoContenedor: Dp = 48.dp,
    tamanoIcono: Dp = 24.dp
) {
    Box(
        modifier = modifier
            .size(tamanoContenedor)
            .background(color = colorFondo, shape = RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icono,
            contentDescription = descripcion,
            tint = colorIcono,
            modifier = Modifier.size(tamanoIcono)
        )
    }
}