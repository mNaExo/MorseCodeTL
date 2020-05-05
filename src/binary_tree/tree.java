package binary_tree;

public class tree {

    node root;

    node leftSub;

    node rightSub;

    /**
     * Konstruktor für einen Baum ohne childs
     * @param pRoot - Wurzel-node
     */
    tree(node pRoot) {
        this.root = pRoot;
        this.leftSub = null;
        this.rightSub = null;
    }

    /**
     * Konstruktor für einen Baum mit childs
     * @param pRoot - Wurzel-node
     * @param pLeftSub - "left-child"
     * @param pRightSub - "right-child"
     */
    tree (node pRoot, node pLeftSub, node pRightSub) {
        this.root = pRoot;
        this.leftSub = pLeftSub;
        this.rightSub = pRightSub;
    }

}
