package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hny extends hnq {
    private final Object[] c;
    private final hoc d;

    public hny(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int b = hod.b(i2);
        this.d = new hoc(objArr, ffmk.g(i, b), b, i3);
    }

    @Override // defpackage.hnq, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        hoc hocVar = this.d;
        if (hocVar.hasNext()) {
            this.a++;
            return hocVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - hocVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        hoc hocVar = this.d;
        int i3 = hocVar.b;
        if (i <= i3) {
            this.a = i2;
            return hocVar.previous();
        }
        Object[] objArr = this.c;
        this.a = i2;
        return objArr[i2 - i3];
    }
}
