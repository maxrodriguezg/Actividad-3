package com.example.intento_dos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.intento_dos.ui.Tab
import com.example.intento_dos.ui.components.EduAppNavigationBar
import com.example.intento_dos.ui.components.EduAppTopBar
import com.example.intento_dos.ui.components.layout.EduAppCursosScreen
import com.example.intento_dos.ui.components.layout.EduAppInicioScreen
import com.example.intento_dos.ui.components.layout.EduAppPerfilScreen
import com.example.intento_dos.ui.theme.IntentodosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntentodosTheme {
                PikachuApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PikachuApp(modifier: Modifier = Modifier) {
    var selectedTab by rememberSaveable { mutableIntStateOf(0) }

    var tabActual = Tab.entries[selectedTab]

    Scaffold(
        modifier = modifier,
        containerColor = Color(0xFFF7F8FC),
        topBar = {
            EduAppTopBar(pestaña = stringResource(id = tabActual.labelRes))
        },
        bottomBar = {
            EduAppNavigationBar(
                selectedTab = com.example.intento_dos.ui.Tab.entries[selectedTab],
                onTabSelected = { tab -> selectedTab = tab.ordinal }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            when (selectedTab) {
                0 -> EduAppInicioScreen()
                1 -> EduAppCursosScreen()
                2 -> EduAppPerfilScreen()
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntentodosTheme {
        Greeting("Android")
    }
}