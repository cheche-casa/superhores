import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.superheroes.data.heroe

@Composable
fun HeroeItem(
    heroe: heroe,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Row(){
            HeroeInformation(heroe.name, heroe.description)
            HeroeIcon(heroe.imageResourceId)
        }
    }
}

@Composable
fun HeroeInformation(
    @StringRes Name: Int,
    @StringRes Description: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(Name),
            style = MaterialTheme.typography.headlineSmall        )
        Text(
            text = stringResource(Description),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun HeroeIcon(
    @DrawableRes heroeIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
//            .size(dimensionResource(id = R.dimen.image_size))
//            .padding(dimensionResource(id = R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
        painter = painterResource(heroeIcon),

        // Content Description is not needed here - image is decorative, and setting a null content
        // description allows accessibility services to skip this element during navigation.

        contentDescription = null
    )
}
