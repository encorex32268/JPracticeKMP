@file:OptIn(KoinExperimentalAPI::class, ExperimentalMaterial3Api::class, KoinExperimentalAPI::class)

package chen.example.lee.jppractice.feature.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import jpractice.composeapp.generated.resources.Res
import jpractice.composeapp.generated.resources.ic_word_change
import jpractice.composeapp.generated.resources.icon_volume_off
import jpractice.composeapp.generated.resources.icon_volume_on
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@Composable
fun HomeScreenRoot(
    viewModel: HomeViewModel = koinViewModel()
){
    val state by viewModel.state.collectAsState()
    HomeScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
fun HomeScreen(
    state: HomeState,
    onAction: (HomeAction) -> Unit ={}
){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                title = {
                    Text(
                        text = "Small Top App Bar",
                        color = Color.White
                    )
                },
                actions = {
                    IconButton(
                        onClick = {
                            onAction(HomeAction.VolumeClick)
                        },
                        content = {
                            Icon(
                                imageVector = vectorResource(
                                    if (state.isOpenVolume){
                                        Res.drawable.icon_volume_on
                                    }else{
                                        Res.drawable.icon_volume_off
                                    }
                                ),
                                contentDescription = "Home Volume"
                            )
                        }
                    )
                    IconButton(
                        onClick = {
                            onAction(HomeAction.AllSwitchKana)
                        },
                        content = {
                            Icon(
                                modifier = Modifier.size(32.dp),
                                painter = painterResource(Res.drawable.ic_word_change),
                                contentDescription = "Home Kana Change"
                            )
                        }
                    )
                }
            )
        }
    ){
        Column(
            modifier = Modifier.fillMaxSize().padding(it)
        ){
            HomeTabRow(
                currentType = state.currentType,
                onAction = onAction
            )
            KanaLazyGrid(
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp)
                ,
                items = state.items,
                kanaType = state.currentType,
                onItemClick = {
                    onAction(
                        HomeAction.OnKanaClick(it)
                    )
                }
            )
        }

    }

}