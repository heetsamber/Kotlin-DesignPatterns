// 주 생성자 private로 선언
public class Singleton private constructor(){
    init {println("This {$this} is a singleton")}

    private object Holder {val INSTANCE = Singleton() } // 객체 생성

    companion object{
        val instance: Singleton by lazy {Holder.INSTANCE}
    }

    var b: String? = null
}

fun main(){
    var first = Singleton.instance  // This (Singleton@7daf6ecc<address>) is a
    // singleton
    first.b = "hello singleton"

    var second = Singleton.instance
    println(first.b)        // hello singleton
    println(second.b)        // hello singleton
}
