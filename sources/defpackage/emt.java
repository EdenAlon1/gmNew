package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emt implements eks {
    final /* synthetic */ eot a;
    final /* synthetic */ boolean b;

    public emt(eot eotVar, boolean z) {
        this.a = eotVar;
        this.b = z;
    }

    @Override // defpackage.eks
    public final float a() {
        eot eotVar = this.a;
        return eoy.a(eotVar.x(), eotVar.b());
    }

    @Override // defpackage.eks
    public final float b() {
        return eoe.a(this.a);
    }

    @Override // defpackage.eks
    public final int c() {
        return this.a.x().a() + this.a.x().d;
    }

    @Override // defpackage.eks
    public final int d() {
        return (int) (this.a.x().e == dqs.a ? this.a.x().b() & 4294967295L : this.a.x().b() >> 32);
    }

    @Override // defpackage.eks
    public final jjc e() {
        return this.b ? new jjc(this.a.b(), 1) : new jjc(1, this.a.b());
    }

    @Override // defpackage.eks
    public final Object f(int i, ffgu ffguVar) {
        Object A = eot.A(this.a, i, ffguVar);
        return A == ffhh.a ? A : ffcu.a;
    }
}
