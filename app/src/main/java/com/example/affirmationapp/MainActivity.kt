package com.example.affirmationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.affirmationapp.ui.theme.AffirmationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AffirmationAppTheme {
                AffirmationDisplay()
            }
        }
    }
}
@Composable
fun AffirmationDisplay(){
    Surface(
         modifier = Modifier.
         fillMaxSize()
             .statusBarsPadding()
            ){
        AffirmationApp(affirmationList = data, modifier = Modifier)
    }
}

@Composable
fun AffirmationApp(affirmationList: List<affirmations>,modifier: Modifier){
    LazyColumn(modifier = modifier) {
        items(affirmationList){affair ->
            AffirmationAppCard(affirmations = affair, modifier = Modifier)
        }
    }
}
@Composable
fun AffirmationAppCard(affirmations: affirmations,modifier: Modifier){
     Card(modifier = modifier){
    Column {
        Image(
            painter = painterResource(id = affirmations.imageResourceId),
            contentDescription = stringResource(id = affirmations.stringResourceId),
            modifier = modifier
                .fillMaxWidth()
                .height(194.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(id = affirmations.stringResourceId),
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineSmall
        )
    }
     }

}