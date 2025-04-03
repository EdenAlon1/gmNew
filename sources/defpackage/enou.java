package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enou extends engw {
    public static final engw a = new enou(new Object[0], 0);
    final transient Object[] b;
    public final transient int c;

    public enou(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.engw, defpackage.engi
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // defpackage.engi
    public final int e() {
        return this.c;
    }

    @Override // defpackage.engi
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        emxf.v(i, this.c);
        Object obj = this.b[i];
        obj.getClass();
        return obj;
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // defpackage.engi
    public final Object[] m() {
        return this.b;
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
