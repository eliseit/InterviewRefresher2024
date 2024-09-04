package ro.etataru.storemgmt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val input = arrayOf("aab", "ac", "dada", "d", "ba", "caa", "baba", "ddd")
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    print("Input: ")
    for (x in input) print("$x, ")
    println()
    println("expected Output: ")
    println("aab  -> 3   // [aab, ba, baba]")
    println("ac   -> 2   // [ac, caa]")
    println("dada -> 1   // [dada]")
    println("d    -> 1   // [d, ddd]")
}