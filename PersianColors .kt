

  class PersianColors {
    /**
     * Iterating through hashmap example.
     */
    private fun iterateExample() {
        for ((key, value) in colors) {
            println("$key $value")
        }
    }

    /**
     * Getting a color example.
     */
    private fun colorExample() = println(colors["red"])
 

    companion object {

        var colors: HashMap<String, String> = object : HashMap<String, String>() {
            init {
                put("red", "#c81d11")
                put("plum", "#701c1c")
                put("pink", "#f77fbe")
                put("rose", "#fe28a2")
                put("green", "#00a693")
                put("orange", "#d99058")
                put("indigo", "#32127a")
                put("blue", "#1c39bb")
                put("mediumBlue", "#0067a5")
            }
        }
    }


}
