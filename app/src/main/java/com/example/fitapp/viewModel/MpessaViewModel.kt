package com.example.fitapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitapp.activities.MpessaActivity
import com.example.fitapp.Repositories.MpessaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MpessaViewModel @Inject constructor(var mpessaRepository: MpessaRepository): ViewModel() {
    lateinit var paymentLiveData: LiveData<List<MpessaActivity>>
    var errorLiveData = MutableLiveData<String>()
    fun fetchPayments(accessToken:String){
        viewModelScope.launch{
            mpessaRepository.fetchPayments((accessToken))
        }
    }
}