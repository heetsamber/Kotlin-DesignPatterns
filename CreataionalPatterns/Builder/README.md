
###Before
```Kotlin

class Computer{
    var OS:String
    var RAM:Int
    var screenSize:Double
    var externalMouse:Boolean
    var externalKeyboard:Boolean
    var battery:String

    constructor(OS: String, RAM: Int, screenSize: Double,
                externalMouse: Boolean, externalKeyboard: Boolean, battery: String) {
        this.OS = OS
        this.RAM = RAM
        this.screenSize = screenSize
        this.externalMouse = externalMouse
        this.externalKeyboard = externalKeyboard
        this.battery = battery
    }

    override fun toString(): String {
        return (" The required configuration is \n" +
                " OS : $OS " +
                " RAM : $RAM \n" +
                " screenSize : $screenSize \n" +
                " externalMouse : $externalMouse \n" +
                " externalKeyboard : $externalKeyboard \n" +
                " battery : $battery \n"
        )
    }
}

fun main(args: Array<String>) {
    var comp = Computer("Windows", 8, 14.5, true, false, "Inbulit")
    println(comp)
}
```
