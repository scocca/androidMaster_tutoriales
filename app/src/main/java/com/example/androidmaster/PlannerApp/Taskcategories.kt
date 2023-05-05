package com.example.androidmaster.PlannerApp

sealed class Taskcategories {
    object Personal : Taskcategories()
    object Business : Taskcategories()
    object Other : Taskcategories()
    object Sport : Taskcategories()
    object Ocio : Taskcategories()
}