package binary_tree;

import java.util.ArrayList;

/**
 * Erstellt von maxim
 * 05.05.2020 - 02:31
 * Projekt: MorseCodeTL
 */

public class Tree {

    /** Aktuell betrachtetes Node,
     * zeigt die Position im Tree an,
     * wichtig für spätere Methoden
     */
    Node currentNode;

    /** "Wurzel"-Node */
    Node root;

    /** Linkes "Child"-Node */
    Node leftSub;

    /** Rechtes "Child"-Node */
    Node rightSub;

    /**
     * Konstruktor für einen Baum ohne childs
     * Root wird als current gesetzt, da es das einzige Node
     * Objekt im Tree ist
     * @param pRoot Wurzel-node
     */
    Tree(Node pRoot) {
        this.currentNode = pRoot;
        this.root = pRoot;
        this.leftSub = null;
        this.rightSub = null;
    }

    /**
     * Konstruktor für einen Baum mit childs
     * @param pRoot Wurzel-node
     * @param pLeftSub "left-child"
     * @param pRightSub "right-child"
     */
    Tree(Node pRoot, Node pLeftSub, Node pRightSub) {
        this.currentNode = pRoot;
        this.root = pRoot;
        this.leftSub = pLeftSub;
        this.rightSub = pRightSub;
    }

    /**
     * Der entsprechende Morsecode des Buchstaben durchläuft
     * jedes einzelne Zeichen von morseCode und bewegt sich je
     * nachdem ob der jetzige Buchstabe "." oder "-" ist nach links oder rechts.
     * Sind alle Zeichen durchlaufen, wird letter als Wert des jetzigen
     * Knotens gesetzt.
     *
     * @param letter    der zu hinzuzufügende Buchstabe
     * @param morseCode das Morse-Äquivalent zum hinzugefügten Buchstaben
     */
    private void insertMorse(String morseCode, String letter) {
        Node current = this.getRoot();

        for (int i = 0; i < morseCode.length(); i++) {
            String direction = morseCode.substring(i, i + 1);

            if (direction.equals(".")) {
                if (current.getLeftSubNode() == null)
                    current.setLeftSubNode(new Node(null, current, Relation.LEFT));

                current = current.getLeftSubNode();
            }
            else if (direction.equals("-")) {
                if (current.getRightSubNode() == null)
                    current.setRightSubNode(new Node(null, current, Relation.RIGHT));

                current = current.getRightSubNode();
            }
        }
        current.setVal(letter);
    }

    /**
     * preOrder Suchdurchlauf
     * hoffentlich klappt das haha
     */
    protected Node preOrderSearch(Node pNode, String pVal) {
        if(pNode != null) {
            if (pNode.getVal().equals(pVal)) {
                return pNode;
            }
            else {
                Node recursiveLeft = preOrderSearch(pNode.getLeftSubNode(), pVal);

                if (recursiveLeft != null)
                    return recursiveLeft;

                return preOrderSearch(pNode.getRightSubNode(), pVal);
            }
        }
        else
            return null;
    }

    /**
     * Rückgabe der CurrentNode
     * @return currentNode aktuelle Node
     */
    protected Node getCurrentNode() {return this.currentNode;}

    /**
     * Änderung der currentNode
     * @param pNewCurrentNode aktuelle Node
     */
    protected void setCurrentNode(Node pNewCurrentNode) {this.currentNode = pNewCurrentNode;}

    /**
     * Rückgabe der Wurzel-node
     *
     * @return root Wurzel
     */
    public Node getRoot() {
        return this.root;
    }

    /**
     * Rückgabe der Left-Child-Node
     * @return leftSub Left-Child
     */
    protected Node getLeftSub() {return this.leftSub;}

    /**
     * Rückgabe der Right-Child-Node
     * @return rightSub Right-Child
     */
    protected Node getRightSub() {return this.rightSub;}

    /**
     * Änderung der Root-Node
     * @param pNewRoot neue Root-Node
     */
    protected void setRoot(Node pNewRoot) {this.root = pNewRoot;}

    /**
     * Änderung der Left-Child-Node
     * @param pNewLeftSub neue Left-Child-Node
     */
    protected void setLeftSub(Node pNewLeftSub) {this.leftSub = pNewLeftSub;}

    /**
     * Änderung der Right-Child-Node
     * @param pNewRightSub neue Right-Child-Node
     */
    protected void setRightSub(Node pNewRightSub) {this.rightSub = pNewRightSub;}

}
