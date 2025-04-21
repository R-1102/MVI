package com.example.mvi

sealed class SignUpAction {
    data class Loading(
        val isLoading: Boolean)
        : SignUpAction()

    data class Validation(
        val fullNameHasError: Boolean,
        val emailHasError: Boolean,
        val passwordHasError: Boolean,
        val conformPasswordHasError: Boolean,
    ) : SignUpAction()


    data class Update(
        val fullName: String,
        val email: String,
        val password: String,
        val confirmPassword: String,
    ) : SignUpAction()

}