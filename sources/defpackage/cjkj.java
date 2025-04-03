package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjkj implements ceve {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/pipeline/PipelineWorkHandler");
    private final /* synthetic */ ceur b;
    private final cjjr c;

    public cjkj(ffsk ffskVar, cjkf cjkfVar, cjls cjlsVar, cjjr cjjrVar, cjkd cjkdVar) {
        ffskVar.getClass();
        eyhz parserForType = cjkm.a.getParserForType();
        parserForType.getClass();
        this.b = new ceur(ffskVar, parserForType, new cjki(cjkfVar, cjkdVar, cjlsVar, null));
        this.c = cjjrVar;
    }

    @Override // defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.f(poa.EXPONENTIAL);
        l.c(this.c.a());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PipelineWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return this.b.a;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ String e() {
        return null;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ String f() {
        return null;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ boolean h(eyhs eyhsVar) {
        return true;
    }

    @Override // defpackage.ceve
    public final /* synthetic */ boolean i(byte[] bArr) {
        return cevb.a(this, bArr);
    }

    @Override // defpackage.ceve
    public final elfl r(ceuw ceuwVar, engw engwVar) {
        return this.b.r(ceuwVar, engwVar);
    }

    @Override // defpackage.ceve
    public final /* synthetic */ void g() {
    }
}
