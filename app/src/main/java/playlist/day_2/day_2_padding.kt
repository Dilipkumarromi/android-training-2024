package playlist.day_2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun day_2_class() {
    Column(
        modifier = Modifier.padding(top=20.dp, start = 50.dp,end=100.dp),

    ) {
        OutlinedTextField(value = "", onValueChange = {"#"})
    }
}