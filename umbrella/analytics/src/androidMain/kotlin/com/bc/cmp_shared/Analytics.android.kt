package com.bc.cmp_shared

class AndroidAnalytics: Analytics {
    override val tag: String
        get() = "Android tag"

}

actual fun getAnalytics(): Analytics {
    return AndroidAnalytics()
}