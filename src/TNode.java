public class TNode<E> { //**TODO:I set every field to public it is need to be checked
    public E key; //The key attribute a poniter to the RunnerId
    public T2_3<E> value;//It is set for the leaves and points the Runner Races he has participated
    public TNode<E> left;
    public TNode<E> middle;
    public TNode<E> right;
    public TNode<E> p;
    public boolean isLeaf;
    public static final String infinty="infinity";// TODO: check about sentinals cause it cant be done this way
    public static final String Minus_infinty="Minus_infinity";

    public TNode(E Key, TNode<E> p,TNode<E> l, TNode<E> m,TNode<E> r,boolean isLeaf) {
        this.key = Key;
        this.p=p;
        this.left = l;
        this.middle = m;
        this.right = r;
        this.isLeaf=isLeaf;
    }

    public TNode(boolean isLeaf) { //it is a simple constructor for creating a node
        this(null,null,null,null,null,isLeaf);
    }
}