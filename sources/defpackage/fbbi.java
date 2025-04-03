package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbi implements fbbf {
    private static final Object a = new Object();
    private volatile fbbf b;
    private volatile Object c = a;

    private fbbi(fbbf fbbfVar) {
        this.b = fbbfVar;
    }

    public static fbbf a(fbbf fbbfVar) {
        if ((fbbfVar instanceof fbbi) || (fbbfVar instanceof fbaz)) {
            return fbbfVar;
        }
        fbbfVar.getClass();
        return new fbbi(fbbfVar);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        fbbf fbbfVar = this.b;
        if (fbbfVar == null) {
            return this.c;
        }
        Object b = fbbfVar.b();
        this.c = b;
        this.b = null;
        return b;
    }
}
