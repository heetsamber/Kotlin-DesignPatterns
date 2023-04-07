open class ComputerBuilder{
    private var OS:String? = null
    private var RAM:Int? = null
    private var screenSize:Double? = null
    private var externalMouse:Boolean? = null
    private var battery:String? = null

    fun setOS(OS:String){
        this.OS = OS
    }
    fun getOS():String?{
        return this.OS
    }
    fun setRAM(RAM:Int){
        this.RAM = RAM
    }
    fun getRAM():Int?{
        return this.RAM
    }
    fun setScreenSize(screenSize:Double){
        this.screenSize = screenSize
    }
    fun getScreenSize():Double?{
        return this.screenSize
    }
    fun setExternalMouse(externalMouse:Boolean){
        this.externalMouse = externalMouse
    }
    fun getExternalMouse():Boolean?{
        return this.externalMouse
    }
    fun setBattery(battery:String){
        this.battery = battery
    }
    fun getBattery():String?{
        return this.battery
    }
}

class Computer{

    var cb:ComputerBuilder
    constructor(compBuild:ComputerBuilder) {
        this.cb = compBuild
    }
    fun build():String{
        return (" The required configuration is \n" +
                " OS : ${cb.getOS()} \n" +
                " RAM : ${cb.getRAM()} \n" +
                " screenSize : ${cb.getScreenSize()} \n" +
                " externalMouse : ${cb.getExternalMouse()} \n" +
                " battery : ${cb.getBattery()}\n")
    }
}

fun main(args: Array<String>) {
    var compBuilder = ComputerBuilder()
    compBuilder.setOS("windows")
    compBuilder.setRAM(12)
    compBuilder.setBattery("Inbuilt")
    // not setting any value for external mouse

    var comp = Computer(compBuilder)
    println(comp.build())
}
