package chen.example.lee.jppractice.feature.home.domain.model

import chen.example.lee.jppractice.feature.home.presentation.KanaType
import chen.example.lee.jppractice.feature.home.presentation.model.KanaUi

data class Kana(
    val hiragana: String,
    val katakana: String,
    val roma: String,
)

fun getKanaListByType(kanaType: KanaType): List<Kana>{
    return when(kanaType){
        KanaType.SEION  -> seion
        KanaType.DAKUON -> dakuon
        KanaType.YOON   -> yoon
    }
}

val seion = listOf(
    // あ行
    Kana(hiragana = "あ", katakana = "ア", roma = "a"),
    Kana(hiragana = "い", katakana = "イ", roma = "i"),
    Kana(hiragana = "う", katakana = "ウ", roma = "u"),
    Kana(hiragana = "え", katakana = "エ", roma = "e"),
    Kana(hiragana = "お", katakana = "オ", roma = "o"),
    // か行
    Kana(hiragana = "か", katakana = "カ", roma = "ka"),
    Kana(hiragana = "き", katakana = "キ", roma = "ki"),
    Kana(hiragana = "く", katakana = "ク", roma = "ku"),
    Kana(hiragana = "け", katakana = "ケ", roma = "ke"),
    Kana(hiragana = "こ", katakana = "コ", roma = "ko"),
    // さ行
    Kana(hiragana = "さ", katakana = "サ", roma = "sa"),
    Kana(hiragana = "し", katakana = "シ", roma = "shi"),
    Kana(hiragana = "す", katakana = "ス", roma = "su"),
    Kana(hiragana = "せ", katakana = "セ", roma = "se"),
    Kana(hiragana = "そ", katakana = "ソ", roma = "so"),
    // た行
    Kana(hiragana = "た", katakana = "タ", roma = "ta"),
    Kana(hiragana = "ち", katakana = "チ", roma = "chi"),
    Kana(hiragana = "つ", katakana = "ツ", roma = "tsu"),
    Kana(hiragana = "て", katakana = "テ", roma = "te"),
    Kana(hiragana = "と", katakana = "ト", roma = "to"),
    // な行
    Kana(hiragana = "な", katakana = "ナ", roma = "na"),
    Kana(hiragana = "に", katakana = "ニ", roma = "ni"),
    Kana(hiragana = "ぬ", katakana = "ヌ", roma = "nu"),
    Kana(hiragana = "ね", katakana = "ネ", roma = "ne"),
    Kana(hiragana = "の", katakana = "ノ", roma = "no"),
    // は行
    Kana(hiragana = "は", katakana = "ハ", roma = "ha"),
    Kana(hiragana = "ひ", katakana = "ヒ", roma = "hi"),
    Kana(hiragana = "ふ", katakana = "フ", roma = "fu"),
    Kana(hiragana = "へ", katakana = "ヘ", roma = "he"),
    Kana(hiragana = "ほ", katakana = "ホ", roma = "ho"),
    // ま行
    Kana(hiragana = "ま", katakana = "マ", roma = "ma"),
    Kana(hiragana = "み", katakana = "ミ", roma = "mi"),
    Kana(hiragana = "む", katakana = "ム", roma = "mu"),
    Kana(hiragana = "め", katakana = "メ", roma = "me"),
    Kana(hiragana = "も", katakana = "モ", roma = "mo"),
    // や行
    Kana(hiragana = "や", katakana = "ヤ", roma = "ya"),
    Kana(hiragana = "", katakana = "", roma = ""),
    Kana(hiragana = "ゆ", katakana = "ユ", roma = "yu"),
    Kana(hiragana = "", katakana = "", roma = ""),
    Kana(hiragana = "よ", katakana = "ヨ", roma = "yo"),
    // ら行
    Kana(hiragana = "ら", katakana = "ラ", roma = "ra"),
    Kana(hiragana = "り", katakana = "リ", roma = "ri"),
    Kana(hiragana = "る", katakana = "ル", roma = "ru"),
    Kana(hiragana = "れ", katakana = "レ", roma = "re"),
    Kana(hiragana = "ろ", katakana = "ロ", roma = "ro"),
    // わ行
    Kana(hiragana = "わ", katakana = "ワ", roma = "wa"),
    Kana(hiragana = "", katakana = "", roma = ""),
    Kana(hiragana = "", katakana = "", roma = ""),
    Kana(hiragana = "", katakana = "", roma = ""),
    Kana(hiragana = "を", katakana = "ヲ", roma = "wo"),
    // ん行
    Kana(hiragana = "ん", katakana = "ン", roma = "n")
)

val dakuon = listOf(
    // が行
    Kana(hiragana = "が", katakana = "ガ", roma = "ga"),
    Kana(hiragana = "ぎ", katakana = "ギ", roma = "gi"),
    Kana(hiragana = "ぐ", katakana = "グ", roma = "gu"),
    Kana(hiragana = "げ", katakana = "ゲ", roma = "ge"),
    Kana(hiragana = "ご", katakana = "ゴ", roma = "go"),
    // ざ行
    Kana(hiragana = "ざ", katakana = "ザ", roma = "za"),
    Kana(hiragana = "じ", katakana = "ジ", roma = "ji"),
    Kana(hiragana = "ず", katakana = "ズ", roma = "zu"),
    Kana(hiragana = "ぜ", katakana = "ゼ", roma = "ze"),
    Kana(hiragana = "ぞ", katakana = "ゾ", roma = "zo"),
    // だ行
    Kana(hiragana = "だ", katakana = "ダ", roma = "da"),
    Kana(hiragana = "ぢ", katakana = "ヂ", roma = "ji"),
    Kana(hiragana = "づ", katakana = "ヅ", roma = "zu"),
    Kana(hiragana = "で", katakana = "デ", roma = "de"),
    Kana(hiragana = "ど", katakana = "ド", roma = "do"),
    // ば行
    Kana(hiragana = "ば", katakana = "バ", roma = "ba"),
    Kana(hiragana = "び", katakana = "ビ", roma = "bi"),
    Kana(hiragana = "ぶ", katakana = "ブ", roma = "bu"),
    Kana(hiragana = "べ", katakana = "ベ", roma = "be"),
    Kana(hiragana = "ぼ", katakana = "ボ", roma = "bo"),
    // ぱ行
    Kana(hiragana = "ぱ", katakana = "パ", roma = "pa"),
    Kana(hiragana = "ぴ", katakana = "ピ", roma = "pi"),
    Kana(hiragana = "ぷ", katakana = "プ", roma = "pu"),
    Kana(hiragana = "ぺ", katakana = "ペ", roma = "pe"),
    Kana(hiragana = "ぽ", katakana = "ポ", roma = "po"),
)

val yoon = listOf(
    // きゃ行
    Kana(hiragana = "きゃ", katakana = "キャ", roma = "kya"),
    Kana(hiragana = "きゅ", katakana = "キュ", roma = "kyu"),
    Kana(hiragana = "きょ", katakana = "キョ", roma = "kyo"),
    // しゃ行
    Kana(hiragana = "しゃ", katakana = "シャ", roma = "sha"),
    Kana(hiragana = "しゅ", katakana = "シュ", roma = "shu"),
    Kana(hiragana = "しょ", katakana = "ショ", roma = "sho"),
    // ちゃ行
    Kana(hiragana = "ちゃ", katakana = "チャ", roma = "cha"),
    Kana(hiragana = "ちゅ", katakana = "チュ", roma = "chu"),
    Kana(hiragana = "ちょ", katakana = "チョ", roma = "cho"),
    // にゃ行
    Kana(hiragana = "にゃ", katakana = "ニャ", roma = "nya"),
    Kana(hiragana = "にゅ", katakana = "ニュ", roma = "nyu"),
    Kana(hiragana = "にょ", katakana = "ニョ", roma = "nyo"),
    // ひゃ行
    Kana(hiragana = "ひゃ", katakana = "ヒャ", roma = "hya"),
    Kana(hiragana = "ひゅ", katakana = "ヒュ", roma = "hyu"),
    Kana(hiragana = "ひょ", katakana = "ヒョ", roma = "hyo"),
    // みゃ行
    Kana(hiragana = "みゃ", katakana = "ミャ", roma = "mya"),
    Kana(hiragana = "みゅ", katakana = "ミュ", roma = "myu"),
    Kana(hiragana = "みょ", katakana = "ミョ", roma = "myo"),
    // りゃ行
    Kana(hiragana = "りゃ", katakana = "リャ", roma = "rya"),
    Kana(hiragana = "りゅ", katakana = "リュ", roma = "ryu"),
    Kana(hiragana = "りょ", katakana = "リョ", roma = "ryo"),
    // ぎゃ行
    Kana(hiragana = "ぎゃ", katakana = "ギャ", roma = "gya"),
    Kana(hiragana = "ぎゅ", katakana = "ギュ", roma = "gyu"),
    Kana(hiragana = "ぎょ", katakana = "ギョ", roma = "gyo"),
    // じゃ行
    Kana(hiragana = "じゃ", katakana = "ジャ", roma = "ja"),
    Kana(hiragana = "じゅ", katakana = "ジュ", roma = "ju"),
    Kana(hiragana = "じょ", katakana = "ジョ", roma = "jo"),
    // びゃ行
    Kana(hiragana = "びゃ", katakana = "ビャ", roma = "bya"),
    Kana(hiragana = "びゅ", katakana = "ビュ", roma = "byu"),
    Kana(hiragana = "びょ", katakana = "ビョ", roma = "byo"),
    // ぴゃ行
    Kana(hiragana = "ぴゃ", katakana = "ピャ", roma = "pya"),
    Kana(hiragana = "ぴゅ", katakana = "ピュ", roma = "pyu"),
    Kana(hiragana = "ぴょ", katakana = "ピョ", roma = "pyo")
)

