package morse;

/**
 * Erstellt von maxim
 * 06.05.2020 - 13:56
 * Projekt: MorseCodeTL
 */
public enum morse_key {
    /*
    TODO: Alle Buchstaben mit entsprechendem Code eintippen
     */
    a(".-"),
    b("-..."),
    c("-.-"),
    d("-.."),
    e("."),
    f("..-."),
    g("--."),
    h("...."),
    i(".."),
    j(".---"),
    k("-.-"),
    l(".-.."),
    m("--"),
    n("-."),
    o("---"),
    p(".--."),
    q("--.-"),
    r(".-."),
    s("..."),
    t("-"),
    u("..-"),
    v("...-"),
    w(".--"),
    x("-..-"),
    y("-.--"),
    z("--.");

    public final String morseCode;

    morse_key(String pMorseCode) {this.morseCode = pMorseCode;}
}
