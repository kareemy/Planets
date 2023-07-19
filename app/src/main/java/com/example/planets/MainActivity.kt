package com.example.planets

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.planets.data.DataSource
import com.example.planets.model.Planet
import com.example.planets.ui.theme.PlanetsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlanetsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlanetApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun PlanetApp() {
    PlanetList(DataSource.planets)
}

@Composable
fun PlanetList(planetList: List<Planet>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(planetList) {planet ->
            PlanetCard(
                planet = planet,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun PlanetCard(planet: Planet, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = planet.imageResourceId),
                contentDescription = stringResource(id = planet.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
                    .background(Color.Black),
                //contentScale is commented out on purpose. You can uncomment it or change it
                //to try different looks for the image.
                //contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = planet.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
fun PlanetCardPreview() {
    // Call PlanetCard and pass in first planet as sample data to preview
    PlanetCard(planet = DataSource.planets[0])
}