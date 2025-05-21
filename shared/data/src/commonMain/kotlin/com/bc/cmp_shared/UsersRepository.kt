package com.bc.cmp_shared

expect fun premiumStatus(): String

fun getUserPremiumStatus(): String {
    return "User status is: ${premiumStatus()}"
}