package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mua implements mxf {
    private final mxf a;
    private final lrv b;

    public mua(mxf mxfVar, lrv lrvVar) {
        this.a = mxfVar;
        this.b = lrvVar;
    }

    @Override // defpackage.mxj
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.mxf
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.mxj
    public final int c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.mxj
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.mxj
    public final lqc e(int i) {
        return this.b.a(this.a.a(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mua)) {
            return false;
        }
        mua muaVar = (mua) obj;
        return this.a.equals(muaVar.a) && this.b.equals(muaVar.b);
    }

    @Override // defpackage.mxf
    public final lqc f() {
        return this.b.a(this.a.b());
    }

    @Override // defpackage.mxj
    public final lrv g() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }
}
