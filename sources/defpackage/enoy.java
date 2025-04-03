package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enoy extends engw {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    public enoy(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        emxf.v(i, this.c);
        Object obj = this.a[i + i + this.b];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.engi
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // defpackage.engw, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
