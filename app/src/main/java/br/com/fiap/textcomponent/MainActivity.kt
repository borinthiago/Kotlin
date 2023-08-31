package br.com.fiap.textcomponent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.textcomponent.ui.theme.Blackops
import br.com.fiap.textcomponent.ui.theme.TextComponentTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextComponentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (modifier =
        Modifier
        .background(color = Color(0xFF241F1F))
            //.padding(20.dp)
        , horizontalAlignment = Alignment.End
    ){
        Text(
//            modifier =
//            Modifier
//                .background(Color(29, 111, 119, 255))
//                .border(border = BorderStroke(4.dp, color = Color.Yellow))
//                .padding(16.dp, 56.dp)
//                .width(200.dp)
//              fillMaxWidth(),
            text = "FIAP",
            fontSize = 18.sp,
            color = Color(0xFFC514A8),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.background(Color.Green).fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text( text = "Desenvolvendo aplicações Android",
            fontSize = 18.sp,
            color = Color(0xFFFFFFFF),
            fontFamily = Blackops
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TextComponentTheme {
        Greeting()
    }
}