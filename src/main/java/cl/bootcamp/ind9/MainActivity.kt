package cl.bootcamp.ind9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cl.bootcamp.ind9.ui.theme.Ind9Theme
import cl.bootcamp.ind9.view.HomeView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ind9Theme {
                HomeView()
            }
        }
    }
}

