package screen.student

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.os.Build
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Media
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidtraining.Greeting
import com.example.androidtraining.R
import com.example.androidtraining.ui.theme.AndroidTrainingTheme


@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun enrollment() {
    val firstName = remember {
        mutableStateOf("")
    }
    val keyboardController = LocalSoftwareKeyboardController.current

    val stateName = listOf("Select State", "Kolkata", "Delhi", "SEW")
    val districtName = listOf("Select District", "Muzaffarpur", "Patna", "Kaimur")
    val coursesName = listOf("Select Courses", "DCA", "ADCA", "DTP")

    var isExpandedDistrict by remember {
        mutableStateOf(false)
    }

    var isExpandedCourses by remember {
        mutableStateOf(false)
    }

    var isExpanded by remember {
        mutableStateOf(false)
    }
    var selectText by remember {
        mutableStateOf(stateName[0])
    }
    var selectDistrictText by remember {
        mutableStateOf(districtName[0])
    }
    var selectCoursesText by remember {
        mutableStateOf(districtName[0])
    }

    //upload images
    val context = LocalContext.current
    val img: Bitmap =
        BitmapFactory.decodeResource(Resources.getSystem(), android.R.drawable.ic_menu_report_image)
    val bitmap = remember {
        mutableStateOf(img)
    }
    val launcher =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.TakePicturePreview()) {
            if (it != null) {
                bitmap.value = it
            }

        }
    val launcherImage =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.GetContent()) {
            if (Build.VERSION.SDK_INT < 28) {
                bitmap.value = MediaStore.Images.Media.getBitmap(context.contentResolver, it)
            } else {
                val source = it?.let { it1 ->
                    ImageDecoder.createSource(context.contentResolver, it1)
                }
                bitmap.value = source?.let { it1 ->
                    ImageDecoder.decodeBitmap(it1)
                }!!
            }
        }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        OutlinedTextField(value = firstName.value, onValueChange = {
            firstName.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Person")
            },
            label = {
                Text(text = "first name")
            },
            placeholder = {
                Text(text = "enter the first name")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        OutlinedTextField(value = firstName.value, onValueChange = {
            firstName.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Person")
            },
            label = {
                Text(text = "lasr name")
            },
            placeholder = {
                Text(text = "enter the last name")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        OutlinedTextField(value = firstName.value, onValueChange = {
            firstName.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Person")
            },
            label = {
                Text(text = "father's name")
            },
            placeholder = {
                Text(text = "enter the father's name")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        OutlinedTextField(value = firstName.value, onValueChange = {
            firstName.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "Person")
            },
            label = {
                Text(text = "mother's name")
            },
            placeholder = {
                Text(text = "enter the mother's name")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        OutlinedTextField(value = firstName.value, onValueChange = {
            firstName.value = it
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            leadingIcon = {
                Icon(Icons.Default.Phone, contentDescription = "Person")
            },
            label = {
                Text(text = "mobile number")
            },
            placeholder = {
                Text(text = "enter the mobile number")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            singleLine = true
        )
        // state dropdown
        ExposedDropdownMenuBox(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            expanded = isExpanded,
            onExpandedChange = { isExpanded = !isExpanded })
        {
            OutlinedTextField(
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                value = selectText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                })
            ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false })
            {
                stateName.forEachIndexed { index, items ->
                    DropdownMenuItem(
                        text = { Text(text = items) },
                        onClick = {
                            selectText = stateName[index]
                            isExpanded = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }

        // district dropdown
        ExposedDropdownMenuBox(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            expanded = isExpandedDistrict,
            onExpandedChange = { isExpandedDistrict = !isExpandedDistrict })
        {
            OutlinedTextField(
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                value = selectDistrictText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpandedDistrict)
                })
            ExposedDropdownMenu(
                expanded = isExpandedDistrict,
                onDismissRequest = { isExpandedDistrict = false })
            {
                districtName.forEachIndexed { index, items ->
                    DropdownMenuItem(
                        text = { Text(text = items) },
                        onClick = {
                            selectDistrictText = districtName[index]
                            isExpandedDistrict = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }

        // course dropdown
        ExposedDropdownMenuBox(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp),
            expanded = isExpandedCourses,
            onExpandedChange = { isExpandedCourses = !isExpandedCourses })
        {
            OutlinedTextField(
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),
                value = selectCoursesText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpandedCourses)
                })
            ExposedDropdownMenu(
                expanded = isExpandedCourses,
                onDismissRequest = { isExpandedCourses = false })
            {
                districtName.forEachIndexed { index, items ->
                    DropdownMenuItem(
                        text = { Text(text = items) },
                        onClick = {
                            selectCoursesText = coursesName[index]
                            isExpandedCourses = false
                        },
                        contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                    )
                }
            }
        }
        Image(

            bitmap = bitmap.value.asImageBitmap(),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp)
                .clip(CircleShape)
                .size(150.dp)
                .background(Color.White)
                .border(
                    width = 1.dp,
                    color = Color.Red,
                    shape = CircleShape
                )


        )
        Row(
             

            verticalAlignment = Alignment.CenterVertically


        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Camera")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Gallery")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            border = BorderStroke(1.dp, Color.Red),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
        ) {
            Text(text = "Enroll Now")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidTrainingTheme {
        enrollment()
    }
}