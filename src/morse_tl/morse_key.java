package morse_tl;

/**
 * Erstellt von maxim
 * 06.05.2020 - 13:56
 * Projekt: MorseCodeTL
 */
public enum morse_key {

    A(".-", "A"),
    B("-...", "B"),
    C("-.-", "C"),
    D("-..", "D"),
    E(".", "E"),
    F("..-.", "F"),
    G("--.", "G"),
    H("....", "H"),
    I("..", "I"),
    J(".---", "J"),
    K("-.-", "K"),
    L(".-..", "L"),
    M("--", "M"),
    N("-.", "N"),
    O("---", "O"),
    P(".--.", "P"),
    Q("--.-", "Q"),
    R(".-.", "R"),
    S("...", "S"),
    T("-", "T"),
    U("..-", "U"),
    V("...-", "V"),
    W(".--", "W"),
    X("-..-", "X"),
    Y("-.--", "Y"),
    Z("--.", "Z");

    public final String morseCode;
    public final String letter;

    morse_key(String pMorseCode, String pLetter) {this.morseCode = pMorseCode; this.letter = pLetter;}
}
