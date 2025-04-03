package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fecm implements fecn {
    private final Object a;
    private final Object b;

    public fecm(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.fecn
    public final int a() {
        return 1;
    }

    @Override // defpackage.fecn
    public final fecn b(Object obj, Object obj2, int i, int i2) {
        int hashCode = this.a.hashCode();
        if (hashCode != i) {
            return fecl.d(new fecm(obj, obj2), i, this, hashCode, i2);
        }
        Object obj3 = this.a;
        return obj3 == obj ? new fecm(obj, obj2) : new feck(new Object[]{obj3, obj}, new Object[]{this.b, obj2});
    }

    @Override // defpackage.fecn
    public final Object c(Object obj, int i, int i2) {
        if (this.a == obj) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}
