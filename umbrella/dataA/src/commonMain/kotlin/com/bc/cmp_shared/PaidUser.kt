package com.bc.cmp_shared

data class PaidUser(
    val user: User,
    val premium: PremiumType,
)

enum class PremiumType {
    PLATINIUM,
    GOLD,
    SILVER
}