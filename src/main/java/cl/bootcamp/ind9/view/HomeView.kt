package cl.bootcamp.ind9.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import cl.bootcamp.ind9.viewmodel.IMCViewModel
import cl.bootcamp.ind9.componetes.CustomButton
import cl.bootcamp.ind9.componetes.CustomOutlinedTextField
import cl.bootcamp.ind9.componetes.CustomSpacer
import cl.bootcamp.ind9.componetes.CustomText
import cl.bootcamp.ind9.componetes.SegmentedButtonSingleSelect

@Preview
@Composable
fun HomeView() {
    val viewModel: IMCViewModel = viewModel()
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

        val focusManager = LocalFocusManager.current

        CustomOutlinedTextField(
            label = "Edad (Años)",
            value = viewModel.edad,
            onValueChange = {viewModel.edad = it },
            focusManager = focusManager
        )
        CustomSpacer()
        CustomOutlinedTextField(
            label = "Peso (Kg)",
            value = viewModel.peso,
            onValueChange = {viewModel.peso = it },
            focusManager = focusManager
        )
        CustomSpacer()
        CustomOutlinedTextField(
            label = "Altura (Cm)",
            value = viewModel.altura,
            onValueChange = {viewModel.altura = it },
            focusManager = focusManager
        )
        CustomSpacer()

        CustomButton(
            text = "Calcular",
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 10.dp
                )
        ) { viewModel.calculateIMC() }

        CustomSpacer()

        CustomText("${String.format("%.1f", viewModel.imcResult)}")
    }
}