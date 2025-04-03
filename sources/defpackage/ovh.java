package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ovh extends ovi {
    private final oyf a;

    public ovh(oxi oxiVar, String str) {
        super(oxiVar, str);
        this.a = oxiVar.k(str);
    }

    @Override // defpackage.oxf
    public final int a() {
        k();
        return 0;
    }

    @Override // defpackage.oxf
    public final long b(int i) {
        k();
        oxe.b(21, "no row");
        throw new ffbx();
    }

    @Override // defpackage.oxf
    public final String c(int i) {
        k();
        oxe.b(21, "no row");
        throw new ffbx();
    }

    @Override // defpackage.oxf, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        m();
    }

    @Override // defpackage.oxf
    public final String d(int i) {
        k();
        oxe.b(21, "no row");
        throw new ffbx();
    }

    @Override // defpackage.oxf
    public final void e(int i, long j) {
        k();
        this.a.e(i, j);
    }

    @Override // defpackage.oxf
    public final void f(int i) {
        k();
        this.a.f(i);
    }

    @Override // defpackage.oxf
    public final void g(int i, String str) {
        str.getClass();
        k();
        this.a.g(i, str);
    }

    @Override // defpackage.oxf
    public final boolean i(int i) {
        k();
        oxe.b(21, "no row");
        throw new ffbx();
    }

    @Override // defpackage.oxf
    public final boolean j() {
        k();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.oxf
    public final void h() {
    }
}
