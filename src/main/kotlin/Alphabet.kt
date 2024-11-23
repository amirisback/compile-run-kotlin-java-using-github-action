package io.github.amirisback

var line1 = mutableListOf<String>()
var line2 = mutableListOf<String>()
var line3 = mutableListOf<String>()
var line4 = mutableListOf<String>()
var line5 = mutableListOf<String>()

fun showText(text: String) {
    val data = text.toCharArray()

    data.forEachIndexed { index, c ->
        when (c) {
            'A' -> createA()
            'a' -> createA()
            'B' -> createB()
            'b' -> createB()
            'C' -> createC()
            'c' -> createC()
            'D' -> createD()
            'd' -> createD()
            'E' -> createE()
            'e' -> createE()
            'F' -> createF()
            'f' -> createF()
            'G' -> createG()
            'g' -> createG()
            'H' -> createH()
            'h' -> createH()
            'I' -> createI()
            'i' -> createI()
            'J' -> createJ()
            'j' -> createJ()
            'K' -> createK()
            'k' -> createK()

        }
    }

    println(line1)
    println(line2)
    println(line3)
    println(line4)
    println(line5)
}

fun createA() {
    line1.add(" ### ")
    line2.add("#   #")
    line3.add("#####")
    line4.add("#   #")
    line5.add("#   #")
}

fun createB() {
    line1.add("#### ")
    line2.add("#  ##")
    line3.add("#####")
    line4.add("#  ##")
    line5.add("#### ")
}

fun createC() {
    line1.add("#####")
    line2.add("#    ")
    line3.add("#    ")
    line4.add("#    ")
    line5.add("#####")
}

fun createD() {
    line1.add("#### ")
    line2.add("#   #")
    line3.add("#   #")
    line4.add("#   #")
    line5.add("#### ")
}

fun createE() {
    line1.add("#####")
    line2.add("#    ")
    line3.add("#####")
    line4.add("#    ")
    line5.add("#####")
}

fun createF() {
    line1.add("#####")
    line2.add("#    ")
    line3.add("#####")
    line4.add("#    ")
    line5.add("#    ")
}

fun createG() {
    line1.add("#####")
    line2.add("#    ")
    line3.add("#####")
    line4.add("#   #")
    line5.add("#####")
}

fun createH() {
    line1.add("#   #")
    line2.add("#   #")
    line3.add("#####")
    line4.add("#   #")
    line5.add("#   #")
}

fun createI() {
    line1.add("#")
    line2.add("#")
    line3.add("#")
    line4.add("#")
    line5.add("#")
}

fun createJ() {
    line1.add("   ##")
    line2.add("    #")
    line3.add("    #")
    line4.add("#   #")
    line5.add("#####")
}

fun createK() {
    line1.add("#   #")
    line2.add("# #  ")
    line3.add("##   ")
    line4.add("# #  ")
    line5.add("#   #")
}