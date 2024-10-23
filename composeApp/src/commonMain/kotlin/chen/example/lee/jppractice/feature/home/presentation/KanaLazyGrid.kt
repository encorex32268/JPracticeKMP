package chen.example.lee.jppractice.feature.home.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import chen.example.lee.jppractice.feature.home.domain.model.Kana
import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

@Composable
fun KanaLazyGrid(
    modifier: Modifier = Modifier,
    kanaType: KanaType,
    items: List<KanaUi> = emptyList(),
    onItemClick: (KanaUi) -> Unit
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(kanaType.gridCount),
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        items(items){ kanaUi ->
            KanaItem(
                kanaUi = kanaUi,
                modifier = Modifier.clickable(
                    enabled = kanaUi.kana.isNotEmpty()
                ){
                    onItemClick(kanaUi)
                }
            )
        }
    }
}
