package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImagePreview(text1 = stringResource(R.string.jetpack_compose_tutorial),
                        text2 = stringResource(R.string.jetpack_compose_is_a_modern_toolkit),
                        text3 = stringResource(R.string.in_this_tutorial_you_build_a_simple))
                }
            }
        }
    }
}

@Composable
fun ImagePreview(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column  {
        Image(
            painter = image,
            contentDescription = null,
    )
        TextPreview(text1 = text1 , text2 = text2 , text3 = text3, modifier = Modifier
        )
    }
}

@Composable
fun TextPreview(text1: String, text2: String, text3: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = text1,
            fontSize = 24.sp,

            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = text3,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        ImagePreview(
            text1 = stringResource(R.string.jetpack_compose_tutorial),
            text2 = stringResource(R.string.jetpack_compose_is_a_modern_toolkit),
            text3 = stringResource(R.string.in_this_tutorial_you_build_a_simple)
            )

    }
}