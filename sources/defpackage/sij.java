package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sij implements sid {
    public static final ejui a = new ejtz("TRANSCRIPTION_SETTINGS_DATA_SERVICE_KEY");
    public final ffsk b;
    public final comc c;
    private final ffhd d;
    private final ejvp e;
    private final akzt f;

    public sij(ffsk ffskVar, ffhd ffhdVar, comc comcVar, ejvp ejvpVar, akzt akztVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ejvpVar.getClass();
        akztVar.getClass();
        this.b = ffskVar;
        this.d = ffhdVar;
        this.c = comcVar;
        this.e = ejvpVar;
        this.f = akztVar;
    }

    @Override // defpackage.sid
    public final ejxi a() {
        return new sii(this);
    }

    @Override // defpackage.sid
    public final Object b(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new sig(null, this), ffguVar);
    }

    @Override // defpackage.sid
    public final void c(final boolean z) {
        final ffji ffjiVar = new ffji() { // from class: sie
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ejui ejuiVar = sij.a;
                sib sibVar = (sib) sic.a.createBuilder();
                sibVar.getClass();
                sibVar.copyOnWrite();
                sic sicVar = (sic) sibVar.instance;
                sicVar.b |= 1;
                sicVar.c = z;
                eyfy build = sibVar.build();
                build.getClass();
                return (sic) build;
            }
        };
        this.e.a(this.c.j(new emwl() { // from class: sif
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = sij.a;
                return ffji.this.invoke(obj);
            }
        }), a);
        this.f.c(true != z ? "Bugle.Vmt.OptOut.Count" : "Bugle.Vmt.OptIn.Count");
    }
}
