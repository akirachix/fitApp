package com.example.fitapp.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fitapp.SignUp

@Dao
interface SignUpDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSignUp(signUp: SignUp)

    @Query("SELECT * FROM signupDetails")

    fun gellAllsignupDetails(): LiveData<List<SignUp>>

    @Query("SELECT * FROM signupDetails ")

}