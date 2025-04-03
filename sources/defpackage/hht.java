package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hht implements hep {
    private final hep a;
    private final int b;
    private int c;

    public hht(hep hepVar, int i) {
        this.a = hepVar;
        this.b = i;
    }

    @Override // defpackage.hep
    public final Object a() {
        return this.a.a();
    }

    @Override // defpackage.hep
    public final /* synthetic */ void b(ffjm ffjmVar, Object obj) {
        heo.a(this, ffjmVar, obj);
    }

    @Override // defpackage.hep
    public final void c() {
        throw null;
    }

    @Override // defpackage.hep
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.hep
    public final /* synthetic */ void g() {
        Object a = a();
        hez hezVar = a instanceof hez ? (hez) a : null;
        if (hezVar != null) {
            hezVar.d();
        }
    }

    @Override // defpackage.hep
    public final void h() {
        if (this.c <= 0) {
            hfp.j("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.hep
    public final void i(int i, Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.hep
    public final void j(int i, Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.hep
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.hep
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.hep
    public final /* synthetic */ void f() {
    }
}
