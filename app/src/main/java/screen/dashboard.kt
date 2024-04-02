package screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun Dashboard(navController: NavHostController) {
    Column {
        Button(onClick = {
            navController.navigate("Home")

        }) {
            Text(text = "login")
        }
        Text(text = "Dashboard Screen")
    }
}