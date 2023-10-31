package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
                }
            }
        }
    }
}


@Composable
fun ComposeText( title: String, words:String, words2: String,    modifier: Modifier= Modifier){
Column(  ) {
    TopImage()


    Text(
        text = title,
        fontSize = 24.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,

        modifier = Modifier
            .padding(16.dp)


    )
    Text(
        text = words,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(16.dp)
    )
    Text(
        text = words2,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(16.dp)
    )
}
}

@Composable
fun TopImage(modifier: Modifier= Modifier ){
    val image = painterResource(R.drawable.bg_compose_background__1_)
    Box{
        Image(
            painter = image,
            contentDescription = null,


        )

    }



}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme{

        ComposeText(title = "Jetpack Compose tutorial" , words= "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            words2 = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")


    }
}