package chen.example.lee.jppractice.feature.home.presentation

import chen.example.lee.jppractice.feature.home.domain.mapper.toKanaUi
import chen.example.lee.jppractice.feature.home.domain.model.getKanaListByType
import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

data class HomeState(
    val currentType: KanaType = KanaType.SEION,
    val items: List<KanaUi> = getKanaListByType(KanaType.SEION).map { it.toKanaUi() },
    val isOpenVolume: Boolean = false
)
