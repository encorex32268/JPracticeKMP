package chen.example.lee.jppractice.feature.home.presentation

import androidx.lifecycle.ViewModel
import chen.example.lee.jppractice.feature.home.domain.mapper.toKanaUi
import chen.example.lee.jppractice.feature.home.domain.model.getKanaListByType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel: ViewModel() {

    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()


    fun onAction(action: HomeAction){
        when(action){
            is HomeAction.OnKanaClick -> {
                val stateItems = state.value.items.map {
                    if (it.roma == action.kanaUi.roma){
                        it.copy(
                            kana = if (it.kana == it.hiragana){
                                it.katakana
                            }else{
                                it.hiragana
                            }
                        )
                    }else{
                        it
                    }
                }
                _state.update {
                    it.copy(
                        items = stateItems
                    )
                }
            }
            is HomeAction.SwitchType  -> {
                _state.update {
                    it.copy(
                        items = getKanaListByType(action.kanaType).map { it.toKanaUi() },
                        currentType = action.kanaType
                    )
                }
            }
            HomeAction.AllSwitchKana -> {
                val items = state.value.items
                val hiraganaItems = items.filter { it.kana == it.hiragana }
                val katakanaItems = items.filter { it.kana == it.katakana }
                val isHiraganaMore = hiraganaItems.size >= katakanaItems.size
                if (isHiraganaMore){
                    _state.update {
                        it.copy(
                            items = items.map {kanaUi ->
                                kanaUi.copy(
                                    kana = kanaUi.katakana
                                )
                            }
                        )
                    }
                }else{
                    _state.update {
                        it.copy(
                            items = items.map {kanaUi ->
                                kanaUi.copy(
                                    kana = kanaUi.hiragana
                                )
                            }
                        )
                    }
                }
            }

            HomeAction.VolumeClick   -> {
                //TODO KEY Setting
                _state.update {
                    it.copy(
                        isOpenVolume = !it.isOpenVolume
                    )
                }
            }
        }

    }
}