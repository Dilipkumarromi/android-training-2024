package screen

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtraining.R

@Composable
fun EachRow() {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp) // Adjusted vertical padding
            .height(150.dp) // Reduced height
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp) // Rounded corners with 8.dp radius
    ) {
        Row(
            modifier = Modifier.padding(8.dp) // Adjusted padding
        ) {
            Image(
                painter = painterResource(R.drawable.romi),
                contentDescription = "Image",
                modifier = Modifier
                    .size(100.dp) // Adjusted image size
                    .align(Alignment.CenterVertically)
                    .clip(RoundedCornerShape(8.dp)) // Rounded corners for the image
            )
            Spacer(modifier = Modifier.width(8.dp)) // Added spacer for separation
            Text(
                text = "Description",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(vertical = 8.dp) // Adjusted padding
            )
        }
    }
}

