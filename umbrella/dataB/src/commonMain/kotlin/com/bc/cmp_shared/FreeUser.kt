package com.bc.cmp_shared

data class FreeUser(
    val user: User,
    val freemium: FreemiumType,
)

enum class FreemiumType {
    NEWBIE,
    MODERATOR,
    STANDARD
}