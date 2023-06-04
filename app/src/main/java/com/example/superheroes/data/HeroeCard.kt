import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.R
import com.example.superheroes.data.heroe

@Composable
fun HeroeItem(
    heroe: heroe,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.elevation)),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .sizeIn(minHeight = dimensionResource(R.dimen.card_size))
        ) {
            Column(modifier = modifier
                .weight(1f)
            ) {
                Text(
                    text = stringResource(heroe.name),
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = stringResource(heroe.description),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Spacer(Modifier.width(dimensionResource(R.dimen.padding_medium)))
            Box(
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_size))
                    .clip(RoundedCornerShape(8.dp))

            ) {

                Image(
                    contentScale = ContentScale.FillWidth,
                    painter = painterResource(heroe.imageResourceId),
                    alignment = Alignment.TopCenter,
                    contentDescription = null
                )
            }
        }
    }
}
