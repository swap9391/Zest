package com.sj.zest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform