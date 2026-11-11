package com.example.appejemplo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appejemplo.ui.screens.PostScreen
import com.example.appejemplo.ui.theme.AppEjemploTheme
class MainActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppEjemploTheme() {
                val postViewModel: com.example.appejemplo.viewmodel.PostViewModel = viewModel()
                PostScreen(viewModel = postViewModel)
            }
        }
    }
}