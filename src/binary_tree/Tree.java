package binary_tree;

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
     * Methode zum Hinzufügen von Nodes zu einem Baum
     * @param toBeAdded Node, die hinzugefügt werden soll
     */
    protected void addNodeToTree(Node toBeAdded) {
        //TODO: Methode implementieren
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
     * @return root Wurzel
     */
    protected Node getRoot() {return this.root;}

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
