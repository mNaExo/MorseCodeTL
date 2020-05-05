package binary_tree;

/**
 * Erstellt von maxim
 * 05.05.2020 - 02:09
 * Projekt: MorseCodeTL
 */

public class node {

    // direkter Vorfahre
    node supNode;

    // linker "Nachfahre"
    node leftSubNode;

    // rechter "Nachfahre"
    node rightSubNode;

    // Wert des Nodes
    String val;

    /**
     * Konstruktor für ein Wurzel-Node
     * @param pVal Wert des Nodes
     */
    node(String pVal) {
        this.supNode = null;
        this.leftSubNode = null;
        this.rightSubNode = null;
        this.val = pVal;
    }

    /**
     * Konstruktor für ein Standard-Node
     * @param pVal Wert des Nodes
     * @param pSupNode Parent-Node
     */
    node(String pVal, node pSupNode) {
        this.supNode = pSupNode;
        this.leftSubNode = null;
        this.rightSubNode = null;
        this.val = pVal;
    }

    /**
     * Rückgabe des Wertes
     * @return val
     */
    protected String getVal() {return this.val;}

    /**
     * Rückgabe des Vorgänger-Nodes
     * @return supNode
     */
    protected node getSupNode() {return this.supNode;}

    /**
     * Rückgabe des linken Nachfahre-Nodes
     * @return leftSupNode
     */
    protected node getLeftSubNode() {return this.leftSubNode;}

    /**
     * Rückgabe des rechten Nachfahre-Nodes
     * @return rightSupNode
     */
    protected node getRightSubNode() {return this.rightSubNode;}

    /**
     * Änderung des Node-Wertes
     * @param pVal neuer Wert
     */
    protected void setVal(String pVal) {this.val = pVal;}

    /**
     * Änderung des rechten Nachfahre-Nodes
     * @param pNewRightSubNode neus Right-Child-Node
     */
    protected void setRightSubNode(node pNewRightSubNode) {this.rightSubNode = pNewRightSubNode;}

    /**
     * Änderung des linken Nachfahre-Nodes
     * @param pNewLeftSubNode neues Left-Child-Node
     */
    protected void setLeftSubNode(node pNewLeftSubNode) {this.leftSubNode = pNewLeftSubNode;}

    /**
     * Änderung des Vorgänger-Nodes
     * @param pNewSupNode neues Parent-Node
     */
    protected void setSupNode(node pNewSupNode) {this.supNode = pNewSupNode;}
}
