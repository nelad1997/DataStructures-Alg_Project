public class T2_3<E> {
    private TNode<E> root;

    public T2_3() {
        this.root=Init();
    }
    public TNode<E> Init(){// creates an empty tree
        TNode<E> x=new TNode<>(false);
        TNode<E> l=new TNode<>(true);
        TNode<E> m=new TNode<>(true);
        l.key=Minus_infinity; //TODO: check
        m.key=infinity;//TODO: check
        x.left =l;
        x.middle =m;
        return x;
    }
    public TNode<E> TSearch(TNode<E> x ,E k) {//we need this function in order to add races for runners
        if (x.isLeaf)
           if ( x.key == k )//TODO: check about equality because it a pointers equality and not objects.
              return x;
           else return null;
        if (k ≤ x.left.key)
           return TSearch(x.left, k);
        if (k ≤x.middle.key)
            return TSearch(x.middle, k);
        else return TSearch(x.right, k);
    }

}
