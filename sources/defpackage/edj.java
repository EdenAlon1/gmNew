package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edj implements eks {
    final /* synthetic */ eey a;
    final /* synthetic */ boolean b;

    public edj(eey eeyVar, boolean z) {
        this.a = eeyVar;
        this.b = z;
    }

    @Override // defpackage.eks
    public final float a() {
        eey eeyVar = this.a;
        return ekt.a(eeyVar.b(), eeyVar.c(), eeyVar.h());
    }

    @Override // defpackage.eks
    public final float b() {
        eey eeyVar = this.a;
        return ekt.b(eeyVar.b(), eeyVar.c());
    }

    @Override // defpackage.eks
    public final int c() {
        return this.a.d().b() + this.a.d().a();
    }

    @Override // defpackage.eks
    public final int d() {
        return (int) (this.a.d().h() == dqs.a ? this.a.d().g() & 4294967295L : this.a.d().g() >> 32);
    }

    @Override // defpackage.eks
    public final jjc e() {
        return this.b ? new jjc(-1, 1) : new jjc(1, -1);
    }

    @Override // defpackage.eks
    public final Object f(int i, ffgu ffguVar) {
        Object n = eey.n(this.a, i, ffguVar);
        return n == ffhh.a ? n : ffcu.a;
    }
}
