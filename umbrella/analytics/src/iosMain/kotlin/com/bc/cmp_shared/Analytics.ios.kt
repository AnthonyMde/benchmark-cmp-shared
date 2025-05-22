package com.bc.cmp_shared

class IosAnalytics: Analytics {
    override val tag: String
        get() = "ios tag"

}

actual fun getAnalytics(): Analytics {
    return IosAnalytics()
}