package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dji implements dsg {
    public static final hrh a = new hrk(djd.a, dje.a);
    public float b;
    public final hjz c = new hhy(0);
    public final dwn d = new dwn();
    public final hjz e = new hhy(Alert.DURATION_SHOW_INDEFINITELY);
    private final dsg f = new dne(new djh(this));
    private final hkx g;
    private final hkx h;
    private final hjz i;

    public dji(int i) {
        this.i = new hhy(i);
        djg djgVar = new djg(this);
        hqg hqgVar = hkg.a;
        this.g = new hgk(djgVar, null);
        this.h = new hgk(new djf(this), null);
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return this.f.a(f);
    }

    public final int b() {
        return this.e.c();
    }

    public final int c() {
        return this.i.c();
    }

    public final Object d(int i, cxt cxtVar, ffgu ffguVar) {
        Object a2 = drc.a(this, i - c(), cxtVar, ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.dsg
    public final Object e(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        Object e = this.f.e(dhyVar, ffjmVar, ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    public final void f(int i) {
        this.i.i(i);
    }

    @Override // defpackage.dsg
    public final boolean g() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean h() {
        return ((Boolean) this.g.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean i() {
        return this.f.i();
    }
}
