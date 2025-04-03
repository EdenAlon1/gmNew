package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enaq extends emzp {
    final Object g;
    final int h;
    final enbg i;
    volatile enau j = enbf.b;

    public enaq(Object obj, int i, enbg enbgVar) {
        this.g = obj;
        this.h = i;
        this.i = enbgVar;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final int a() {
        return this.h;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final enau d() {
        return this.j;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final enbg e() {
        return this.i;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final Object j() {
        return this.g;
    }

    @Override // defpackage.emzp, defpackage.enbg
    public final void p(enau enauVar) {
        this.j = enauVar;
    }
}
