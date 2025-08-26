package com.sp45.newsly.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sp45.newsly.presentation.onboarding.OnboardingEvent.SaveAppEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val saveAppEntry: com.sp45.newsly.domain.usecases.app_entry.SaveAppEntry
) : ViewModel() {

    fun onEvent(event: OnboardingEvent){
        when(event){
            is OnboardingEvent.SaveAppEntry ->{
                saveUserEntry()
            }
        }
    }

    private fun saveUserEntry() {
        viewModelScope.launch {
            saveAppEntry()
        }
    }

}