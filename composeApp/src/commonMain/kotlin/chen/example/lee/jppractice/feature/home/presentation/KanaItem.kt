package chen.example.lee.jppractice.feature.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

@Composable
fun KanaItem(
    modifier: Modifier = Modifier,
    kanaUi: KanaUi
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(2.dp , Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = kanaUi.kana,
            fontSize = 36.sp
        )
        Text(
            text = kanaUi.roma,
            fontSize = 20.sp
        )
    }

}