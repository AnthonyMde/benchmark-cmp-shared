package com.bc.cmp_shared

interface Analytics {
    val tag: String
}

expect fun getAnalytics(): Analytics