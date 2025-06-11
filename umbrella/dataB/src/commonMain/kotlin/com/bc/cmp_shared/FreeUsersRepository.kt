package com.bc.cmp_shared

fun getFreeUser(): FreeUser {
    return FreeUser(
        user = User(
            name = "Fabien",
        ),
        freemium = FreemiumType.NEWBIE
    )
}