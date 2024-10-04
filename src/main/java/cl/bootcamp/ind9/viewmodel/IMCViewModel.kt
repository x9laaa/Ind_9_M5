package cl.bootcamp.ind9.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class IMCViewModel: ViewModel() {
    var edad by mutableStateOf("")
    var peso by mutableStateOf("")
    var altura by mutableStateOf("")
    var imcResult by mutableFloatStateOf(0F)

    fun calculateIMC() {
        val pesoValue = peso.toFloatOrNull() ?: 0f
        val altoValue = altura.toFloatOrNull()?.div(100) ?: 0f // Convertir cm a metros
        imcResult = if (altoValue > 0) pesoValue / (altoValue * altoValue) else 0f
    }
}