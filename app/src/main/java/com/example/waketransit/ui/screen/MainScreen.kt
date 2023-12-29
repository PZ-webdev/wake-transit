import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.waketransit.R
import com.example.waketransit.ui.screen.MapScreen

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "WakeTransit",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 50.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.directions),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            onClick = { navController.navigate("mapScreen") },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Start")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { /* Dodaj obsługę kliknięcia */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Finish")
        }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    val navController = rememberNavController()
    MainScreen(navController = navController)
}
