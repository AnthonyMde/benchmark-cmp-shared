package com.bc.cmp_shared

fun getPaidUser(): PaidUser {
    return PaidUser(
        user = User(
            name = "Anthony",
        ),
        premium = PremiumType.PLATINIUM,
    )
}