package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmss implements cmso {
    public final comc a;
    public final ejvp b;
    public final akzt c;
    private final ffsk d;

    public cmss(comc comcVar, ejvb ejvbVar, ejvp ejvpVar, ffsk ffskVar, akzt akztVar) {
        ejvbVar.getClass();
        ejvpVar.getClass();
        ffskVar.getClass();
        akztVar.getClass();
        this.a = comcVar;
        this.b = ejvpVar;
        this.d = ffskVar;
        this.c = akztVar;
    }

    @Override // defpackage.cmso
    public final elfl a(boolean z) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cmsr(this, z, null));
        return c;
    }

    @Override // defpackage.cmso
    public final boolean b() {
        ekzz f = eleg.f("ReactionsSettingsDataServiceImpl#getEnableIosReactionClassificationSync");
        try {
            cmsv cmsvVar = (cmsv) this.a.l();
            boolean z = (cmsvVar.b & 1) != 0 ? cmsvVar.c : true;
            ffig.a(f, null);
            return z;
        } finally {
        }
    }
}
