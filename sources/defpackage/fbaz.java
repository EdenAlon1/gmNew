package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbaz implements fbbf, fazb {
    private static final Object a = new Object();
    private volatile fbbf b;
    private volatile Object c = a;

    private fbaz(fbbf fbbfVar) {
        this.b = fbbfVar;
    }

    public static fazb a(fbbf fbbfVar) {
        if (fbbfVar instanceof fazb) {
            return (fazb) fbbfVar;
        }
        fbbfVar.getClass();
        return new fbaz(fbbfVar);
    }

    public static fbbf c(fbbf fbbfVar) {
        fbbfVar.getClass();
        return fbbfVar instanceof fbaz ? fbbfVar : new fbaz(fbbfVar);
    }

    private final synchronized Object d() {
        Object obj = this.c;
        Object obj2 = a;
        if (obj != obj2) {
            return obj;
        }
        Object b = this.b.b();
        Object obj3 = this.c;
        if (obj3 != obj2 && obj3 != b) {
            throw new IllegalStateException(a.k(b, obj3, "Scoped provider was invoked recursively returning different results: ", " & ", ". This is likely due to a circular dependency."));
        }
        this.c = b;
        this.b = null;
        return b;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        Object obj = this.c;
        return obj == a ? d() : obj;
    }
}
