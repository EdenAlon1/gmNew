package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eled implements ffvh {
    public static final elec a = new elec();
    public final elaw b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final eleb f;

    public eled(elaw elawVar, boolean z, boolean z2, boolean z3) {
        this.b = elawVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        boolean z4 = false;
        if (z && !z2) {
            z4 = true;
        }
        this.f = new eleb(elawVar, z4);
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ Object a(ffhd ffhdVar) {
        ffhdVar.getClass();
        elao b = ekyf.b();
        eleb elebVar = b.e;
        elat elatVar = b.c;
        eleb elebVar2 = this.f;
        b.e = elebVar2;
        ekyf.x(b, elebVar2.a, 1);
        return new elea(elatVar, elebVar);
    }

    @Override // defpackage.ffvh
    public final /* bridge */ /* synthetic */ void b(ffhd ffhdVar, Object obj) {
        elea eleaVar = (elea) obj;
        ffhdVar.getClass();
        eleaVar.getClass();
        elat elatVar = eleaVar.a;
        elao b = ekyf.b();
        ekyf.x(b, elatVar, 3);
        b.e = eleaVar.b;
    }

    public final eled c() {
        eleb elebVar = ekyf.b().e;
        boolean f = elebVar != null ? elebVar.f() : false;
        return new eled(this.b, ekyf.a || this.c || this.e, (!(elebVar != null ? elebVar.b : true) || f || this.d || this.f.f()) && !this.e, false);
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffgz.a(this, r, ffjmVar);
    }

    @Override // defpackage.ffha, defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        return (E) ffgz.b(this, ffhbVar);
    }

    @Override // defpackage.ffha
    public final ffhb<?> getKey() {
        return a;
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        return ffgz.c(this, ffhbVar);
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgz.d(this, ffhdVar);
    }
}
