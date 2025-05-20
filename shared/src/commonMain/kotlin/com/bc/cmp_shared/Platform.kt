package com.bc.cmp_shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform