package screen

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androidtraining.R

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun loginScreen(navController: NavHostController) {
    val username = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    var isPasswordHidden by rememberSaveable { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEFF4FA)),
        verticalArrangement = Arrangement.Center,


    ) {

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Image",
            modifier = Modifier
                .size(100.dp) // Adjusted image size
                .align(androidx.compose.ui.Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(8.dp)) // Rounded corners for the image
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "IIHN Education Centre",
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
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        OutlinedTextField(value = password.value, onValueChange = {
            password.value = it
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
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true

        )
        Text(text = "Forgot password", fontSize = 10.sp,

            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp, end = 12.dp)
                .align(AbsoluteAlignment.Right),
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