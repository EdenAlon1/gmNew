package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekm implements deki {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final fgcm d;
    private final ffsk e;

    public dekm(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3) {
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.e = ffskVar;
        this.c = ffbrVar3;
        this.d = fgdm.a(deke.a);
    }

    @Override // defpackage.deki
    public final fgdj a() {
        return this.d;
    }

    @Override // defpackage.deki
    public final void b(eixn eixnVar) {
        if (eixnVar == null || (((avdj) this.c.b()).a() && !ffkj.e(eixnVar.b().k, "google"))) {
            this.d.f(dekf.a);
        } else {
            axol.k(this.e, null, new dekl(this, eixnVar, null), 3);
        }
    }
}
