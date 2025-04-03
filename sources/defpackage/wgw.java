package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgw {
    public final aixt a;
    public final ffsk b;
    private final ejvb c;

    public wgw(aixt aixtVar, ejvb ejvbVar, ffsk ffskVar) {
        ejvbVar.getClass();
        ffskVar.getClass();
        this.a = aixtVar;
        this.c = ejvbVar;
        this.b = ffskVar;
    }

    public final ejuh a() {
        return new ejuy(this.c, new eros() { // from class: wgu
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c;
                wgw wgwVar = wgw.this;
                c = axol.c(wgwVar.b, ffhe.a, ffsm.a, new wgv(wgwVar, null));
                return new erph(c);
            }
        }, "magic_compose_availability_data_source");
    }
}
