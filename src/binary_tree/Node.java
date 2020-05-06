package binary_tree;

import javax.management.relation.RelationType;

/**
 * Erstellt von maxim
 * 05.05.2020 - 02:09
 * Projekt: MorseCodeTL
 */

public class Node {

    // direkter Vorfahre
    Node supNode;

    // linker "Nachfahre"
    Node leftSubNode;

    // rechter "Nachfahre"
    Node rightSubNode;

    // Wert des Nodes
    String val;

    // Reltations
    Relation relToSupNode;
    Relation relToLSubNode;
    Relation relToRSubNode;

    /**
     * Konstruktor für ein Wurzel-Node
     * @param pVal Wert des Nodes
     */
    Node(String pVal) {
        this.supNode = null;
        this.relToSupNode = null;
        this.leftSubNode = null;
        this.relToLSubNode = null;
        this.rightSubNode = null;
        this.relToRSubNode = null;
        this.val = pVal;
    }

    /**
     * Konstruktor für ein Standard-Node
     * @param pVal Wert des Nodes
     * @param pSupNode Parent-Node
     */
    Node(String pVal, Node pSupNode, Relation pRelToSup) {
        this.supNode = pSupNode;
        this.relToSupNode = pRelToSup;
        this.leftSubNode = null;
        this.relToLSubNode = null;
        this.rightSubNode = null;
        this.relToRSubNode = null;
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
    protected Node getSupNode() {return this.supNode;}

    /**
     * Rückgabe des linken Nachfahre-Nodes
     * @return leftSupNode
     */
    protected Node getLeftSubNode() {return this.leftSubNode;}

    /**
     * Rückgabe des rechten Nachfahre-Nodes
     * @return rightSupNode
     */
    protected Node getRightSubNode() {return this.rightSubNode;}

    /**
     * Änderung des Node-Wertes
     * @param pVal neuer Wert
     */
    protected void setVal(String pVal) {this.val = pVal;}

    /**
     * Änderung des rechten Nachfahre-Nodes
     * @param pNewRightSubNode neus Right-Child-Node
     */
    protected void setRightSubNode(Node pNewRightSubNode) {this.rightSubNode = pNewRightSubNode;}

    /**
     * Änderung des linken Nachfahre-Nodes
     * @param pNewLeftSubNode neues Left-Child-Node
     */
    protected void setLeftSubNode(Node pNewLeftSubNode) {this.leftSubNode = pNewLeftSubNode;}

    /**
     * Änderung des Vorgänger-Nodes
     * @param pNewSupNode neues Parent-Node
     */
    protected void setSupNode(Node pNewSupNode) {this.supNode = pNewSupNode;}

    /**
     * Rückgabe der Relation zum root-node
     * @return relToSupNode relative Position zum supNode
     */
    protected Relation getRelToSupNode() {return this.relToSupNode;}

    /**
     * Rückgabe der Relation zum leftSub-node
     * @return relToLSubNode relative Position zum leftSubNode
     */
    protected Relation getRelToLSubNode() {return this.relToLSubNode;}

    /**
     * Rückgabe der Relation zum rightSub-node
     * @return relToRSubNode relative Position zum rightSubNode
     */
    protected Relation getRelToRSubNode() {return this.relToRSubNode;}

    /**
     * Änderung der Relation zur supNode
     * @param pRelToSup relative Position zum supNode
     */
    protected void setRelToSupNode(Relation pRelToSup) {this.relToSupNode = pRelToSup;}

    /**
     * Änderung der Relation zur leftSubNode
     * @param pRelToLSub relative Position zu leftSubNode
     */
    protected void setRelToLSubNode(Relation pRelToLSub) {this.relToLSubNode = pRelToLSub;}

    /**
     * Änderung der Relation zur rightSubNode
     * @param pRelToRSub relative Position zur rightSubNode
     */
    protected void setRelToRSubNode(Relation pRelToRSub) {this.relToRSubNode = pRelToRSub;}

}
