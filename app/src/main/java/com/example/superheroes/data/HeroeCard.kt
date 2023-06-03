import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.R
import com.example.superheroes.data.heroe
import com.example.superheroes.ui.theme.SuperheroesTheme

@Composable
fun HeroeItem(
    heroe: heroe,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.elevation))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .sizeIn(minHeight = dimensionResource(R.dimen.card_size))
        ) {
            Column(modifier = modifier
                .padding(end = dimensionResource(R.dimen.padding_medium))
            ) {
                Text(modifier = modifier,
                    color = colorResource(R.color.purple_700),
                    text = stringResource(heroe.name),
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(modifier = modifier,
                    text = stringResource(heroe.description),
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier
//            .size(72.dp)
//            .clip(RoundedCornerShape(MaterialTheme.shapes.small))
            ) {

                Image(
                    modifier = modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .clip(MaterialTheme.shapes.small),
                    contentScale = ContentScale.Fit,
                    painter = painterResource(heroe.imageResourceId),
                    alignment = Alignment.CenterEnd,
                    contentDescription = null
                )
            }
        }
    }
}
