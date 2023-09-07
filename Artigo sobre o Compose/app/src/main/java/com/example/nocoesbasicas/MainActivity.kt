package com.example.nocoesbasicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nocoesbasicas.ui.theme.NocoesBasicasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NocoesBasicasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(title= stringResource(id = R.string.title),
                        firstText = stringResource(id = R.string.first_text),
                        secondText = stringResource(id = R.string.second_text))
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String,
             firstText: String,
             secondText: String,
             modifier: Modifier = Modifier) {
      val image = painterResource(id = R.drawable.bg_compose_background)
      Column {
          Image(
              painter = image,
              contentDescription = null
          )
          Text(
              text = title,
              textAlign = TextAlign.Center,
              fontSize = 24.sp,
              modifier = Modifier
                  .padding(16.dp)
                  .align(alignment = Alignment.CenterHorizontally)
          )
          Text(
              text = firstText,
              textAlign = TextAlign.Justify,
              fontSize = 12.sp,
              modifier = Modifier
                  .padding(horizontal = 16.dp)
          )
          Text(
              text= secondText,
              fontSize = 12.sp,
              textAlign = TextAlign.Justify,
              modifier = Modifier
                  .padding(16.dp)
          )
      }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NocoesBasicasTheme {
        Greeting(title= stringResource(id = R.string.title),
                 firstText = stringResource(id = R.string.first_text),
                 secondText = stringResource(id = R.string.second_text)
            )
    }
}