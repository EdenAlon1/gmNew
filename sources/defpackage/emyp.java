package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emyp<T> implements emyl<T> {
    private static final emyl a = new emyl() { // from class: emyo
        @Override // defpackage.emyl
        public final Object get() {
            throw new IllegalStateException();
        }
    };
    private final emyy b = new emyy();
    private volatile emyl c;
    private Object d;

    public emyp(emyl emylVar) {
        emylVar.getClass();
        this.c = emylVar;
    }

    @Override // defpackage.emyl
    public final T get() {
        emyl emylVar = this.c;
        emyl emylVar2 = a;
        if (emylVar != emylVar2) {
            synchronized (this.b) {
                if (this.c != emylVar2) {
                    T t = (T) this.c.get();
                    this.d = t;
                    this.c = emylVar2;
                    return t;
                }
            }
        }
        return (T) this.d;
    }

    public final String toString() {
        Object obj = this.c;
        if (obj == a) {
            obj = "<supplier that returned " + String.valueOf(this.d) + ">";
        }
        return a.F(obj, "Suppliers.memoize(", ")");
    }
}
