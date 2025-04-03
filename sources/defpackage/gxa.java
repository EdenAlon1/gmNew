package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxa implements dsg {
    public static final hrh a = hqn.a(gwx.a, gwz.a);
    public final gww b;

    public gxa(int i, float f, ffix ffixVar) {
        this.b = new gww(i, f, ffixVar);
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.dsg
    public final Object e(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        Object r = eot.r(this.b, dhyVar, ffjmVar, ffguVar);
        return r == ffhh.a ? r : ffcu.a;
    }

    @Override // defpackage.dsg
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.dsg
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.dsg
    public final boolean i() {
        return this.b.i();
    }
}
