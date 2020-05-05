package binary_tree;

/**
 * Erstellt von maxim
 * 05.05.2020 - 02:31
 * Projekt: MorseCodeTL
 */

public class tree {

    node root;

    node leftSub;

    node rightSub;

    /**
     * Konstruktor für einen Baum ohne childs
     * @param pRoot Wurzel-node
     */
    tree(node pRoot) {
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
    tree (node pRoot, node pLeftSub, node pRightSub) {
        this.root = pRoot;
        this.leftSub = pLeftSub;
        this.rightSub = pRightSub;
    }

    /**
     * Methode zum Hinzufügen von Nodes zu einem Baum
     * @param toBeAdded Node, die hinzugefügt werden soll
     */
    protected void addNodeToTree(node toBeAdded) {

    }

    /**
     * Rückgabe der Wurzel-node
     * @return root Wurzel
     */
    protected node getRoot() {return this.root;}

    /**
     * Rückgabe der Left-Child-Node
     * @return leftSub Left-Child
     */
    protected node getLeftSub() {return this.leftSub;}

    /**
     * Rückgabe der Right-Child-Node
     * @return rightSub Right-Child
     */
    protected node getRightSub() {return this.rightSub;}

    /**
     * Änderung der Root-Node
     * @param pNewRoot neue Root-Node
     */
    protected void setRoot(node pNewRoot) {this.root = pNewRoot;}

    /**
     * Änderung der Left-Child-Node
     * @param pNewLeftSub neue Left-Child-Node
     */
    protected void setLeftSub(node pNewLeftSub) {this.leftSub = pNewLeftSub;}

    /**
     * Änderung der Right-Child-Node
     * @param pNewRightSub neue Right-Child-Node
     */
    protected void setRightSub(node pNewRightSub) {this.rightSub = pNewRightSub;}

}
