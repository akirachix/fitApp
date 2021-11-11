package com.example.fitapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitapp.Repositories.WorkoutsRepository
import com.example.fitapp.models.Workouts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class WorkoutsViewModel @Inject constructor(val  workoutsRepository: WorkoutsRepository): ViewModel(){
    lateinit var  workoutsLiveData: LiveData<List<Workouts>>
    var errorLiveData = MutableLiveData<String>()
    fun fetchWorkouts(accessToken: String){
        viewModelScope.launch{
            workoutsRepository.fetchWorkouts(accessToken)
        }
    }
}