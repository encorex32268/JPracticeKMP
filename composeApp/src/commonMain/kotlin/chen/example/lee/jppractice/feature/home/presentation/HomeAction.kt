package chen.example.lee.jppractice.feature.home.presentation

import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

sealed interface HomeAction {
    data class SwitchType(
        val kanaType: KanaType
    ): HomeAction

    data class OnKanaClick(
        val kanaUi: KanaUi
    ): HomeAction

    data object AllSwitchKana: HomeAction
    data object VolumeClick: HomeAction
}