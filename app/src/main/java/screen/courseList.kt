package screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidtraining.R

@Composable
fun CourseList() {
    val paddingModifier = Modifier
        .padding(10.dp)
        .height(205.dp)
        .width(145.dp)

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Card(

            modifier = paddingModifier,
//            backgroundColor = Color.Gray,
        ) {
            Column(modifier = paddingModifier) {
               Image(painter = painterResource(R.drawable.romi),
                   contentDescription = "Image")
                Text(text = "First Text")
                Text(text = "Second Text")
            }
        }
    }
}