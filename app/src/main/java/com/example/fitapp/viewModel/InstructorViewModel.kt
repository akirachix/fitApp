package com.example.fitapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitapp.Repositories.InstuctorsRepository
import com.example.fitapp.models.Instructors
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
    class InstructorsViewModel @Inject constructor(val instructorsRepository: InstuctorsRepository):
    ViewModel() {
        lateinit var  instructorsLiveData: LiveData<List<Instructors>>
        var errorLiveData = MutableLiveData<String>()
        fun fetchInstructors(accessToken: String){
            viewModelScope.launch{
                instructorsRepository.fetchInstructors(accessToken)
            }
        }

    }

