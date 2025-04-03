package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpd extends enip {
    public static final enpd a;
    private static final Object[] f;
    final transient Object[] b;
    public final transient int c;
    final transient Object[] d;
    public final transient int e;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        a = new enpd(objArr, 0, objArr, 0, 0);
    }

    public enpd(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = i;
        this.d = objArr2;
        this.g = i2;
        this.e = i3;
    }

    @Override // defpackage.enip
    public final boolean b() {
        return true;
    }

    @Override // defpackage.engi
    public final int c(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.engi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.d;
            if (objArr.length != 0) {
                int b = engc.b(obj);
                while (true) {
                    int i = b & this.g;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.engi
    public final int e() {
        return this.e;
    }

    @Override // defpackage.engi
    public final int f() {
        return 0;
    }

    @Override // defpackage.enip
    public final engw h() {
        return engw.i(this.b, this.e);
    }

    @Override // defpackage.enip, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c;
    }

    @Override // defpackage.enip, defpackage.engi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final enqu listIterator() {
        return g().iterator();
    }

    @Override // defpackage.engi
    public final boolean l() {
        return false;
    }

    @Override // defpackage.engi
    public final Object[] m() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.enip, defpackage.engi
    public Object writeReplace() {
        return super.writeReplace();
    }
}
