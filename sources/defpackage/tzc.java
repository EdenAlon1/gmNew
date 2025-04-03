package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzc implements uah {
    public final ffsk a;
    public final ffhd b;
    public final ejvp c;
    public final String d;
    public final ffji e;
    public final fgjb f = new fgjf();
    public ejlc g;
    private final ejvb h;
    private final tyw i;

    public tzc(ffsk ffskVar, ffhd ffhdVar, ejvb ejvbVar, ejvp ejvpVar, String str, tyw tywVar, ffji ffjiVar) {
        this.a = ffskVar;
        this.b = ffhdVar;
        this.h = ejvbVar;
        this.c = ejvpVar;
        this.d = str;
        this.i = tywVar;
        this.e = ffjiVar;
        tywVar.a(new ffix() { // from class: tyu
            @Override // defpackage.ffix
            public final Object invoke() {
                elfl c;
                tzc tzcVar = tzc.this;
                c = axol.c(tzcVar.a, ffhe.a, ffsm.a, new tzb(tzcVar, null));
                tzcVar.c.a(c, tzcVar.d);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.uah
    public final ejuh a() {
        return new ejuy(this.h, new eros() { // from class: tyv
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(tzc.this.b());
            }
        }, this.d);
    }

    @Override // defpackage.uah
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new tyz(this, null));
        return c;
    }

    @Override // defpackage.uah
    public final void c() {
        this.i.b();
    }
}
