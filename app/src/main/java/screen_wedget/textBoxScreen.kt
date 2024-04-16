package screen_wedget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun textBoxScreen() {
    var firstName = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = firstName.value, modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 30.dp),
            onValueChange = {
            firstName.value=it
        },
            leadingIcon = {
                Icon(Icons.Default.Person,  contentDescription ="Person" )
            },
            label={
                Text(text = "Name")
            },
            placeholder = {
                Text(text = "Enter Your Name")
            },
            singleLine = true

        )
    }
}