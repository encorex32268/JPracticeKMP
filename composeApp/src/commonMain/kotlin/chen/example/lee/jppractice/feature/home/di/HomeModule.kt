package chen.example.lee.jppractice.feature.home.di

import chen.example.lee.jppractice.feature.home.presentation.HomeViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val home_module = module {
    viewModelOf(::HomeViewModel)
}