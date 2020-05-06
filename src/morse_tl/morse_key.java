package morse_tl;

/**
 * Erstellt von maxim
 * 06.05.2020 - 13:56
 * Projekt: MorseCodeTL
 */
public enum morse_key {

    A(".-"),
    B("-..."),
    C("-.-"),
    D("-.."),
    E("."),
    F("..-."),
    G("--."),
    H("...."),
    I(".."),
    J(".---"),
    K("-.-"),
    L(".-.."),
    M("--"),
    N("-."),
    O("---"),
    P(".--."),
    Q("--.-"),
    R(".-."),
    S("..."),
    T("-"),
    U("..-"),
    V("...-"),
    W(".--"),
    X("-..-"),
    Y("-.--"),
    Z("--.");

    public final String morseCode;

    morse_key(String pMorseCode) {this.morseCode = pMorseCode;}
}
