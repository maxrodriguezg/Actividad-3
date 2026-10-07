package com.example.intento_dos.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.intento_dos.ui.Tab


/**
 * Barra de navegación inferior estilo Pikachu con botones: Imagen y Descripción.
 */
@Composable
fun EduAppNavigationBar(
    selectedTab: Tab,
    onTabSelected: (Tab) -> Unit,
    modifier: Modifier = Modifier) {
    NavigationBar(
        containerColor = Color(0xFFFFFFFF),
        contentColor = MaterialTheme.colorScheme.onPrimary,
        modifier = modifier) {

        val PestañaActiva = Color(0xFF1A49E8)
        val PestañaInactiva = Color(0xFF9E9FA8)
        val pillIndicator = Color(0xFFE8EDFF)

        Tab.entries.forEach { tab ->
            val selected = tab == selectedTab
            val iconColor = if (selected) {
                MaterialTheme.colorScheme.onPrimary
            } else {
                MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.55f)
            }
            NavigationBarItem(
                selected = selected,
                onClick = { onTabSelected(tab) },
                icon = {
                    Icon(
                        imageVector = tab.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(
                        text = stringResource(id = tab.labelRes)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = PestañaActiva,
                    unselectedIconColor = PestañaInactiva,

                    selectedTextColor = PestañaActiva,
                    unselectedTextColor = PestañaInactiva,

                    // Fondo ovalado detrás del icono seleccionado (píldora Material 3)
                    indicatorColor = pillIndicator // Cambia a Color.Transparent si NO quieres la píldora de fondo
                )
            )
        }
    }
}
