package com.example.fitapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitapp.Repositories.LoginRepository
import com.example.fitapp.Signin
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LoginViewModel @Inject constructor(var loginRepository: LoginRepository): ViewModel() {
    lateinit var loginLiveData: LiveData<List<Signin>>
    var errorLiveData = MutableLiveData<String>()
    fun fetchLogins(accessToken:String){
        viewModelScope.launch{
            loginRepository.fetchLogins(accessToken)
        }
    }
}