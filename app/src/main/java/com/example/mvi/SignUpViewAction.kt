package com.example.mvi

sealed class SignUpViewAction {
    data class ShowToast(val message: String) : SignUpViewAction()
    //here
    data class ShowErrorToast (val errorMessage: String) : SignUpViewAction()

}