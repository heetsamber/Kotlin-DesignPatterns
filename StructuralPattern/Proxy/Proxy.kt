interface File {
    fun read(name: String)
}

class NormalFile : File {
    override fun read(name: String) = println("Reading file: $name")
}

//Proxy:
class SecuredFile : File {
    val normalFile = NormalFile()
    var password: String = ""           // public 으로 접근가능.

    override fun read(name: String) {
        if (password == "secret") {
            println("Password is correct: $password")
            normalFile.read(name)
        } else {
            println("Incorrect password. Access denied!")
        }
    }
}

fun main(args: Array<String>) {
    val securedFile = SecuredFile()
    securedFile.read("readme.md")           // "Incorrect password. Access denied!"

    securedFile.password = "secret"         // 비밀번호 입력
    securedFile.read("readme.md")           // "Password is correct: $password"
}
