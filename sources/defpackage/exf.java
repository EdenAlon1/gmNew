package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exf implements dsg {
    private final /* synthetic */ dsg a;
    private final hkx b;
    private final hkx c;

    public exf(dsg dsgVar, exk exkVar) {
        this.a = dsgVar;
        exe exeVar = new exe(exkVar);
        hqg hqgVar = hkg.a;
        this.b = new hgk(exeVar, null);
        this.c = new hgk(new exd(exkVar), null);
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // defpackage.dsg
    public final Object e(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        return this.a.e(dhyVar, ffjmVar, ffguVar);
    }

    @Override // defpackage.dsg
    public final boolean g() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean h() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean i() {
        return this.a.i();
    }
}
