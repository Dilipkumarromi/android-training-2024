package playlist.day_2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable

@Composable
fun day_padding_Or_margin() {
    Column {
        OutlinedTextField(value = "", onValueChange = {'#'})
    }
}