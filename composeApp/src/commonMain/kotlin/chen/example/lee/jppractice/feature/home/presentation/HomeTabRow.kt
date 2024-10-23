package chen.example.lee.jppractice.feature.home.presentation

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import chen.example.lee.jppractice.feature.core.presentation.ext.customTabIndicatorOffset
import jpractice.composeapp.generated.resources.Res
import jpractice.composeapp.generated.resources.home_dakuon
import jpractice.composeapp.generated.resources.home_seion
import jpractice.composeapp.generated.resources.home_yoon
import org.jetbrains.compose.resources.stringResource

@Composable
fun HomeTabRow(
    currentType: KanaType,
    onAction: (HomeAction) -> Unit = {}
) {

    val density = LocalDensity.current
    val tabWidths = remember {
        val tabWidthStateList = mutableStateListOf<Dp>()
        repeat(KanaType.entries.size){
            tabWidthStateList.add(0.dp)
        }
        tabWidthStateList
    }
    val selectTabIndex = remember(currentType) {
        when(currentType){
            KanaType.SEION  -> 0
            KanaType.DAKUON -> 1
            KanaType.YOON   -> 2
        }
    }
    TabRow(
        selectedTabIndex = selectTabIndex,
        containerColor = Color.White,
        contentColor = Color.Black,
        indicator = { tabPositions ->
            TabRowDefaults.SecondaryIndicator(
                modifier = Modifier.customTabIndicatorOffset(
                    currentTabPosition = tabPositions[selectTabIndex],
                    tabWidth = tabWidths[selectTabIndex]
                ),
                height = 2.dp
            )
        },
        tabs = {
            Tab(
                selected = selectTabIndex==0,
                onClick = {
                    onAction(HomeAction.SwitchType(kanaType = KanaType.SEION))
                },
                text = {
                    Text(
                        onTextLayout = {
                            tabWidths[0] = with(
                                density
                            ){
                                it.size.width.toDp() + 10.dp
                            }
                        },
                        text = stringResource(Res.string.home_seion)
                    )
                }
            )
            Tab(
                selected = selectTabIndex==1,
                onClick = {
                    onAction(HomeAction.SwitchType(kanaType = KanaType.DAKUON))
                },
                text = {
                    Text(
                        onTextLayout = {
                            tabWidths[1] = with(
                                density
                            ){
                                it.size.width.toDp() + 10.dp
                            }
                        },
                        text = stringResource(Res.string.home_dakuon)
                    )
                }
            )

            Tab(
                selected = selectTabIndex==2,
                onClick = {
                    onAction(HomeAction.SwitchType(kanaType = KanaType.YOON))
                },
                text = {
                    Text(
                        onTextLayout = {
                            tabWidths[2] = with(
                                density
                            ){
                                it.size.width.toDp() + 10.dp
                            }
                        },
                        text = stringResource(Res.string.home_yoon)
                    )
                }
            )
        }
    )


}

