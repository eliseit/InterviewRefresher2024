# Interview Refresher 2024

    I: aab, ac, ba, caa, d

    O:
        aab  -> 2       // [aab, ba]
        ac   -> 2       // [ac, caa]
        d    -> 1       // [d]

### Being the string sequence from I (Input), with letters [a-z], write a Kotlin code that generate the output from O, where each row from output represents the number of times a string appears in the sequence having the same letters.

The strings "aab" and "ba" are alike being the letters that compose them: {"a", "b"}.

### In output add the first "word" containing the respective letters.


mapping HMap<String, String>
--------------------------
ab  | aab
ac  | aac

succ_words HSet<String>
------------------------
ab, ac, ad ...

output HMap<String, Integer>
-----------------------------
aab, 3


    I: aab, ac, dada, d, ba, caa, baba, ddd

    O: 
    aab  -> 3   // [aab, ba, baba]
    ac   -> 2   // [ac, caa]
    dada -> 1   // [dada]
    d    -> 2   // [d, ddd]
