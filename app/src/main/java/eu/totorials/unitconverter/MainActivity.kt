package eu.totorials.unitconverter

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import eu.totorials.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}
@Composable
fun UnitConverter() {
    // tao cot
    Column(
        // can chinh vao giua , phan dem , cua giao dien chinh
        modifier = Modifier.fillMaxSize(),
        // center : giao dien ra giua man hinh
        verticalArrangement = Arrangement.Center,
        // can chinh giao dien nam ben trai hoac phai hoac duoi
        //Alignmet.End : nam ben trai
        //Alignmet.Start : mac dinh
        horizontalAlignment = Alignment.CenterHorizontally




    ) {
        // tao hang
        Text("Unit Cpnverter", modifier = Modifier.padding(100.dp))
        // phan dem : la khoang cach voi nhau (them khoang trang)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            // Here goes what should happen, when the value of our OutlinedTextField changes } )
        })

        Row {

            //  val context = LocalContext.current
            // nut button
            // Button(onClick = { Toast.makeText(context, "Thanks for clicking!", Toast.LENGTH_LONG).show()})
            // {
            //    Text("ClickMe!")
            //}
            // }
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }
                // menu
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text("Centimeters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Meters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Feet") }, onClick = { /*TODO*/ })
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text("Centimeters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Meters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text("Feet") }, onClick = { /*TODO*/ })
                }

            }
        }
            Text("Result")
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun UnitConverterPreview() {
        UnitConverter()
    }

