package org.project.harry_potter

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform