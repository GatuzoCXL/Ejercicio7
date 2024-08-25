package com.example.ejercicio7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio7.ui.theme.Ejercicio7Theme
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExplorationComponents()
        }
    }
}

@Composable
fun ExplorationComponents() {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Button
        Button(onClick = { /* Acción */ }) {
            Text("Click aquí")
        }

        // TextField
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Take on Me") }
        )

        // Image
        Image(
            painter = painterResource(id = R.drawable.imagenejemplo),
            contentDescription = "Una imagen",
            modifier = Modifier.size(250.dp)
        )

        // Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Jugo de Naranja")
            Text("Papas fritas")
            Text("Pollo a la Brasa")
        }

        // Switch
        var switchState by remember { mutableStateOf(false) }
        Switch(
            checked = switchState,
            onCheckedChange = { switchState = it }
        )

        // Checkbox
        var checkboxState by remember { mutableStateOf(false) }
        Checkbox(
            checked = checkboxState,
            onCheckedChange = { checkboxState = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExplorationComponents() {
    ExplorationComponents()
}