package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehm implements eks {
    final /* synthetic */ ehh a;

    public ehm(ehh ehhVar) {
        this.a = ehhVar;
    }

    @Override // defpackage.eks
    public final float a() {
        ehh ehhVar = this.a;
        return ekt.a(ehhVar.b(), ehhVar.c(), ehhVar.h());
    }

    @Override // defpackage.eks
    public final float b() {
        ehh ehhVar = this.a;
        return ekt.b(ehhVar.b(), ehhVar.c());
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
        return new jjc(-1, -1);
    }

    @Override // defpackage.eks
    public final Object f(int i, ffgu ffguVar) {
        Object e;
        hrh hrhVar = ehh.a;
        ehh ehhVar = this.a;
        e = ehhVar.e(dhy.a, new ehf(ehhVar, i, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (e != ffhhVar) {
            e = ffcu.a;
        }
        return e == ffhhVar ? e : ffcu.a;
    }
}
