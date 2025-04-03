package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class los extends lml {
    public static final lms a = new lor();
    public final cpo b = new cpo();
    public boolean c = false;

    final lop a(int i) {
        return (lop) cpp.a(this.b, i);
    }

    final void b() {
        this.c = false;
    }

    @Override // defpackage.lml
    protected final void fD() {
        int c = this.b.c();
        for (int i = 0; i < c; i++) {
            ((lop) this.b.e(i)).c();
        }
        cpo cpoVar = this.b;
        int i2 = cpoVar.d;
        Object[] objArr = cpoVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        cpoVar.d = 0;
        cpoVar.a = false;
    }
}
