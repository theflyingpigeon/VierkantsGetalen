class getal() {
    fun deel(delen: Int){
        when {
            delen % 225 == 0 -> eindgetal(delen, 225)
            delen % 196 == 0 -> eindgetal(delen, 196)
            delen % 169 == 0 -> eindgetal(delen, 169)
            delen % 144 == 0 -> eindgetal(delen, 144)
            delen % 121 == 0 -> eindgetal(delen, 121)
            delen % 100 == 0 -> eindgetal(delen, 100)
            delen % 81 == 0 -> eindgetal(delen, 81)
            delen % 64 == 0 -> eindgetal(delen, 64)
            delen % 49 == 0 -> eindgetal(delen, 49)
            delen % 36 == 0 -> eindgetal(delen, 36)
            delen % 25 == 0 -> eindgetal(delen, 25)
            delen % 16 == 0 -> eindgetal(delen, 16)
            delen % 9 == 0 -> eindgetal(delen, 9)
            delen % 4 == 0 -> eindgetal(delen, 4)
            else -> println("Nummer niet deelbaar")
        }
    }

    fun eindgetal(getal:Int, deler:Int) {
        var deelbaarheid: Int = 0
        var getal2 = getal

        while (getal2 != 0){
            getal2 -= deler
            deelbaarheid++
        }

        println("$getal is ${deelbaarheid}x deelbaar door $deler")

        val factor = Math.sqrt(deler.toDouble())
        val wortel = "${factor.toInt()}√${deelbaarheid}"

        println("De factor wortel van $getal is $wortel")
    }
}
