package com.example.intento_dos.ui.components.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Assignment
import androidx.compose.material.icons.outlined.School
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.intento_dos.ui.components.molecules.TarjetaAccion
import com.example.intento_dos.ui.components.organisms.TarjetaCursoActual

@Composable
fun EduAppInicioScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "¡Hola, Maxi!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0F172A)
        )
        //Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Bienvenido a tu aula virtual",
            fontSize = 14.sp,
            color = Color(0xFF64748B)
        )

        TarjetaCursoActual(
            tituloCurso = "Fundamentos de Diseño",
            subtitulo = "Continúa donde lo dejaste",
            progreso = 0.60f,
            onContinuarClick = { /* Acción para abrir curso */ }
        )

        TarjetaAccion(
            titulo = "Mis Tareas",
            subtitulo = "Actividades pendientes",
            icono = Icons.Outlined.Assignment,
            colorFondoIcono = Color(0xFFE0F2FE),
            colorIcono = Color(0xFF0284C7),
            onClick = { /* Navegar a tareas */ }
        )

        TarjetaAccion(
            titulo = "Mis Clases",
            subtitulo = "Horarios y sesiones",
            icono = Icons.Outlined.School,
            colorFondoIcono = Color(0xFFDCFCE7),
            colorIcono = Color(0xFF16A34A),
            onClick = { /* Navegar a clases */ }
        )
    }
}