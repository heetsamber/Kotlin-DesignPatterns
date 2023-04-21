
interface ICurrency{
    fun symbol(): String
    fun code(): String
}

class Euro : ICurrency{
    override fun symbol(): String {
        return "€"
    }

    override fun code(): String {
        return "EUR"
    }
}

class Dollar : ICurrency{
    override fun symbol(): String {
        return "$"
    }

    override fun code(): String {
        return "USD"
    }
}

class Won : ICurrency{
    override fun symbol(): String {
        return "￦"
    }

    override fun code(): String {
        return "WON"
    }
}

enum class Country{
    UnitedStates, Spain, Greece, Korea, Japan
}

fun currency(country: Country) : ICurrency?{
    when(country){
        Country.Spain, Country.Greece -> return Euro()
        Country.UnitedStates -> return Dollar()
        Country.Korea -> return Won()
        else -> return null
    }
}


fun main(args: Array<String>) {
    val noCurrencyCode = "NULL"

    println(currency(Country.Greece)?.code() ?: noCurrencyCode)
    println(currency(Country.Spain)?.code() ?: noCurrencyCode)
    println(currency(Country.UnitedStates)?.code() ?: noCurrencyCode)
    println(currency(Country.Korea)?.code() ?: noCurrencyCode)
    // null
    println(currency(Country.Japan)?.code() ?: noCurrencyCode)
}
