package com.sdlygane.tv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                SDLYGANEHome()
            }
        }
    }
}

private data class MediaTile(
    val title: String,
    val subtitle: String,
    val colors: List<Color>
)

@Composable
private fun SDLYGANEHome() {
    val sections = listOf(
        MediaTile("YouTube", "Videos y canales", listOf(Color(0xFF5B1515), Color(0xFFB3261E))),
        MediaTile("Netflix", "Películas y series", listOf(Color(0xFF171717), Color(0xFF7A1010))),
        MediaTile("Juegos", "Tu biblioteca", listOf(Color(0xFF132A42), Color(0xFF286A8C))),
        MediaTile("Aplicaciones", "Explorar aplicaciones", listOf(Color(0xFF263238), Color(0xFF546E7A)))
    )

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF101216)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFF202630), Color(0xFF101216), Color(0xFF090A0D))
                    )
                )
                .padding(horizontal = 44.dp, vertical = 28.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        "SD LYGANE",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Black
                    )
                    Text(
                        "CENTRO DE ENTRETENIMIENTO",
                        color = Color(0xFF9BA7B5),
                        fontSize = 11.sp,
                        letterSpacing = 2.sp
                    )
                }
                Text("INICIO   ·   BIBLIOTECA   ·   AJUSTES", color = Color(0xFFCBD2DC), fontSize = 12.sp)
            }

            Spacer(Modifier.height(42.dp))

            Text(
                "Todo tu entretenimiento, en un solo lugar.",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(8.dp))
            Text(
                "Una experiencia diseñada para pantalla grande.",
                color = Color(0xFFADB7C4),
                fontSize = 15.sp
            )

            Spacer(Modifier.height(34.dp))
            Text("ACCESO RÁPIDO", color = Color(0xFFADB7C4), fontSize = 12.sp, letterSpacing = 2.sp)
            Spacer(Modifier.height(14.dp))

            LazyRow(
                contentPadding = PaddingValues(end = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                items(sections) { tile ->
                    MediaCard(tile)
                }
            }

            Spacer(Modifier.height(34.dp))
            Text("SD LYGANE  •  VERSIÓN 0.1.0", color = Color(0xFF657080), fontSize = 11.sp)
        }
    }
}

@Composable
private fun MediaCard(tile: MediaTile) {
    val focused = remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .width(230.dp)
            .height(150.dp)
            .background(
                Brush.linearGradient(tile.colors),
                RoundedCornerShape(18.dp)
            )
            .onFocusChanged { focused.value = it.isFocused }
            .focusable()
            .padding(20.dp)
    ) {
        Column {
            Text(
                tile.title,
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.height(6.dp))
            Text(tile.subtitle, color = Color(0xFFE1E6EC), fontSize = 12.sp)
        }
    }
}
