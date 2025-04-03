package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dne implements dsg {
    public final ffji a;
    public final drd b = new dnd(this);
    public final dif c = new dif();
    public final hho d = new hic(false, hla.a);
    public final hho e = new hic(false, hla.a);
    public final hho f = new hic(false, hla.a);

    public dne(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.dsg
    public final Object e(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        Object a = ffsl.a(new dnc(this, dhyVar, ffjmVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
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
        return ((Boolean) this.d.a()).booleanValue();
    }
}
