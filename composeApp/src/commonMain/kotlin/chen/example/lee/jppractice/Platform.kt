package chen.example.lee.jppractice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform