package cl.bootcamp.ind9.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cl.bootcamp.ind9.componetes.CustomButton
import cl.bootcamp.ind9.componetes.CustomOutlinedTextField
import cl.bootcamp.ind9.componetes.CustomSpacer
import cl.bootcamp.ind9.componetes.CustomText
import cl.bootcamp.ind9.componetes.SegmentedButtonSingleSelect

@Preview
@Composable
fun HomeView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomText("Calculadora de IMC")
        SegmentedButtonSingleSelect()
        CustomSpacer()

        var edad by remember { mutableStateOf("") }
        var peso by remember { mutableStateOf("") }
        var altura by remember { mutableStateOf("") }

        CustomOutlinedTextField(
            label = "Edad (Años)",
            value = edad,
            onValueChange = { edad = it })
        CustomSpacer()
        CustomOutlinedTextField(label = "Peso (Kg)",
            value = peso,
            onValueChange = { peso = it })
        CustomSpacer()
        CustomOutlinedTextField(
            label = "Altura (Cm)",
            value = altura,
            onValueChange = { altura = it })
        CustomSpacer()

        CustomButton(
            text = "Calcular",
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 10.dp
                )
        ) {}

    }
}
