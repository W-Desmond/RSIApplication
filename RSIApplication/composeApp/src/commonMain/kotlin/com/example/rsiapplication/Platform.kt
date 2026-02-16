package com.example.rsiapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform