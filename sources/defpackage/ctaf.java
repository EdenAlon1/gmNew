package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctaf implements csza {
    public final ffbr a;
    private final ffbr b;
    private final ffsk c;

    public ctaf(ffbr ffbrVar, ffsk ffskVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffskVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffskVar;
        this.a = ffbrVar2;
    }

    @Override // defpackage.csza
    public final double a() {
        Object e = cszt.A.e();
        e.getClass();
        return ((Number) e).doubleValue();
    }

    @Override // defpackage.csza
    public final elfl b() {
        elfl c;
        if (((auwa) this.b.b()).a()) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new ctae(this, null));
            return c;
        }
        elfl e = elfo.e(false);
        e.getClass();
        return e;
    }

    @Override // defpackage.cszb
    public final eovb c() {
        return eovb.HAPPINESS_TRACKING_MODE_SURVEY;
    }

    @Override // defpackage.csza
    public final String d() {
        Object e = cszt.x.e();
        e.getClass();
        return (String) e;
    }
}
