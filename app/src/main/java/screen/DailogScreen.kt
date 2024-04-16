package screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun DailogScreen() {
    var isDailog by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { isDailog = true }) {
            Text(text = "Click here")
        }
    }
    if (isDailog) {
        Dialog(onDismissRequest = { isDailog = false }) {
            CircularProgressIndicator(
            )
        }
    }
}

fun AlertDialog(
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier,
    buttons: @Composable () -> Unit
) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlertDialogScreen() {
    var isDialog by remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { isDialog = true }) {
            Text(text = "click")
        }
//        if (isDialog) {
//            AlertDialog(
//                onDismissRequest = { /*TODO*/ },
//                modifier = Modifier.fillMaxWidth(),
//
//                title = {
//                    Text(text = "Dialog Box")
//                },
//                text = {
//                    Text("This is Dialog box contents")
//                },
//                buttons = {
//                 Button(onClick = { /*TODO*/ }) {
//                     Text(text = "Ok")
//                 }
//                }
//                ) {
//
//            }
//        }
    }
}