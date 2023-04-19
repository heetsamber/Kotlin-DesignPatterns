enum class CarType {
    MICRO, MINI, LUXURY
}

abstract class Car(model: CarType, location: Location) {

    var model: CarType? = null
    var location: Location? = null

    init {
        this.model = model
        this.location = location
    }

    abstract fun construct()

    override fun toString(): String {
        return "CarModel - $model located in $location"
    }
}

class LuxuryCar(location: Location) : Car(CarType.LUXURY, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to luxury car")
    }
}

class MicroCar(location: Location) : Car(CarType.MICRO, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Micro Car ")
    }
}

class MiniCar(location: Location) : Car(CarType.MINI, location) {
    init {
        construct()
    }

    override fun construct() {
        println("Connecting to Mini car")
    }
}

enum class Location {
    DEFAULT, USA, INDIA
}

class INDIACarFactory {
    fun buildCar(model: CarType): Car? {
        var car: Car? = null
        when (model) {
            CarType.MICRO -> car = MicroCar(Location.INDIA)

            CarType.MINI -> car = MiniCar(Location.INDIA)

            CarType.LUXURY -> car = LuxuryCar(Location.INDIA)

            else -> {
            }
        }
        return car
    }
}

fun buildCar(model: CarType): Car? {
    var car: Car? = null
    when (model) {
        CarType.MICRO -> car = MicroCar(Location.DEFAULT)

        CarType.MINI -> car = MiniCar(Location.DEFAULT)

        CarType.LUXURY -> car = LuxuryCar(Location.DEFAULT)

        else -> {
        }
    }
    return car
}


internal object USACarFactory {
    fun buildCar(model: CarType): Car? {
        var car: Car? = null
        when (model) {
            CarType.MICRO -> car = MicroCar(Location.USA)

            CarType.MINI -> car = MiniCar(Location.USA)

            CarType.LUXURY -> car = LuxuryCar(Location.USA)

            else -> {
            }
        }
        return car
    }
}


class CarFactory {
    fun buildCar(type: CarType): Car? {
        var car: Car? = null
        val location = Location.INDIA

        when (location) {
            Location.USA -> car = USACarFactory.buildCar(type)

            Location.INDIA -> car = INDIACarFactory().buildCar(type)

            else -> car = buildCar(type)
        }

        return car

    }
}

fun main(args: Array<String>) {
    println(CarFactory().buildCar(CarType.MICRO))
    println(CarFactory().buildCar(CarType.MINI))
    println(CarFactory().buildCar(CarType.LUXURY))
}
