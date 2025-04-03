package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enoe extends enom implements Serializable {
    public static final enoe a = new enoe();
    private static final long serialVersionUID = 0;
    private transient enom b;
    private transient enom c;

    private enoe() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.enom
    public final enom a() {
        enom enomVar = this.b;
        if (enomVar != null) {
            return enomVar;
        }
        enof enofVar = new enof(this);
        this.b = enofVar;
        return enofVar;
    }

    @Override // defpackage.enom
    public final enom b() {
        enom enomVar = this.c;
        if (enomVar != null) {
            return enomVar;
        }
        enog enogVar = new enog(this);
        this.c = enogVar;
        return enogVar;
    }

    @Override // defpackage.enom
    public final enom c() {
        return enpf.a;
    }

    @Override // defpackage.enom, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
