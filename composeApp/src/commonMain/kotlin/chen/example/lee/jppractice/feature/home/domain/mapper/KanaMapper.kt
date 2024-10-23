package chen.example.lee.jppractice.feature.home.domain.mapper

import chen.example.lee.jppractice.feature.home.domain.model.Kana
import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

fun Kana.toKanaUi(): KanaUi {
    return KanaUi(
        kana = hiragana,
        hiragana = hiragana,
        katakana = katakana,
        roma = roma
    )
}