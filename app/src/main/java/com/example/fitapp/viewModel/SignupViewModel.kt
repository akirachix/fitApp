package com.example.fitapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitapp.Repositories.SignupRepository
import com.example.fitapp.Signup
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SignupViewModel @Inject constructor(var signupRepository: SignupRepository): ViewModel() {
    lateinit var signupLiveData: LiveData<List<Signup>>
    var errorLiveData = MutableLiveData<String>()
    fun fetchSignups(accessToken: String) {
        viewModelScope.launch {
            signupRepository.fetchSignups(accessToken)

        }
    }
}