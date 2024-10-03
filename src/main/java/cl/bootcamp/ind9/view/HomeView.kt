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

        val focusManager = LocalFocusManager.current

        CustomOutlinedTextField(
            label = "Edad (Años)",
            value = "",
            onValueChange = { },
            focusManager = focusManager
        )
        CustomSpacer()
        CustomOutlinedTextField(
            label = "Peso (Kg)",
            value = "",
            onValueChange = { },
            focusManager = focusManager
        )
        CustomSpacer()
        CustomOutlinedTextField(
            label = "Altura (Cm)",
            value = "",
            onValueChange = { },
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
        ) { }
    }
}