package com.example.intento_dos.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Book
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Image
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.intento_dos.R



enum class Tab(
    val labelRes: Int,
    val icon: ImageVector
) {
    INICIO(R.string.tab_inicio, Icons.Outlined.Home),
    CURSOS(R.string.tab_cursos, Icons.Outlined.Book),
    PERFIL(R.string.tab_perfil, Icons.Outlined.Person)
}
