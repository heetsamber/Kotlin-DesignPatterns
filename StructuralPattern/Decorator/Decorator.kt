
interface MilkShake{
    fun getTaste()
}

class ConcreteMilkShake : MilkShake{
    override fun getTaste() {
        println("It's milk !!")
    }
}

open class MilkShakeDecorator(protected var milkShake: MilkShake) : MilkShake{
    override fun getTaste() {
        this.milkShake.getTaste()
    }
}

class BananaMilkShake(m : MilkShake) : MilkShakeDecorator(m) {
    override public fun getTaste(){
        super.getTaste();
        this.addTaste();
        println("It's banana milk shake !!")
    }

    fun addTaste(){
        println(" Adding Banana flavor to the milk shake !");
    }
}

class PeanutButterMilkShake(m:MilkShake) : MilkShakeDecorator(m){

    override public fun getTaste(){
        super.getTaste ();
        this.addTaste();
        println(" It’s Peanut butter milk shake !");
    }
    fun addTaste(){
        println(" Adding Peanut butter flavor to the milk shake !");
    }
}

fun main(args: Array<String>) {
    val peanutMilkShake = PeanutButterMilkShake(ConcreteMilkShake())
    peanutMilkShake.getTaste()
    val bananaMilkShake = BananaMilkShake(ConcreteMilkShake())
    bananaMilkShake.getTaste()
}
