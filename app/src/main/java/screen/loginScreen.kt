package screen

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun loginScreen(navController: NavHostController) {
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEFF4FA)),
        verticalArrangement = Arrangement.Center,


    ) {
        Text(
            text = "Login",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )
        OutlinedTextField(value = username.value, onValueChange = {
            username.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Person")
            },
            label = {
                Text(text = "username")
            },
            placeholder = {
                Text(text = "enter the username")
            }
        )
        OutlinedTextField(value = username.value, onValueChange = {
            username.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = "key")
            },
            label = {
                Text(text = "password")
            },
            placeholder = {
                Text(text = "enter the password")
            }
        )
        Text(text = "Forgot password", fontSize = 10.sp,
//            modifier = Modifier.align(alignment = Alignment.End),
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            textAlign = TextAlign.End,

        )
        OutlinedButton(onClick = { navController.navigate("Dashboard")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
            ) {
            Text(text = "Login")

        }
    }
}