package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwrd implements cwqs {
    public static final ejui a = new ejtz("EXPRESSIVE_ANIMATIONS_SETTINGS_DATA_SERVICE_KEY");
    public final comc b;
    public final ffsk c;
    private final ffhd d;
    private final ejvp e;
    private final akzt f;

    public cwrd(comc comcVar, ffsk ffskVar, ffhd ffhdVar, ejvp ejvpVar, akzt akztVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ejvpVar.getClass();
        akztVar.getClass();
        this.b = comcVar;
        this.c = ffskVar;
        this.d = ffhdVar;
        this.e = ejvpVar;
        this.f = akztVar;
    }

    @Override // defpackage.cwqs
    public final ejxi a() {
        return new cwrc(this);
    }

    @Override // defpackage.cwqs
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new cwra(this, null));
        return c;
    }

    @Override // defpackage.cwqs
    public final ffxx c() {
        return new cwqz(this.b.e());
    }

    @Override // defpackage.cwqs
    public final void d(final boolean z) {
        final ffji ffjiVar = new ffji() { // from class: cwqt
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ejui ejuiVar = cwrd.a;
                cwri a2 = cwrh.a((cwrf) cwrg.a.createBuilder());
                a2.b(z);
                return a2.a();
            }
        };
        this.e.a(this.b.j(new emwl() { // from class: cwqu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejui ejuiVar = cwrd.a;
                return ffji.this.invoke(obj);
            }
        }), a);
        this.f.e("Bugle.ExpressiveAnimations.Settings.Count", true != z ? 2 : 1);
    }

    public final Object e(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new cwqw(null, this), ffguVar);
    }
}
