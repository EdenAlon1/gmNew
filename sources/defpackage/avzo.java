package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzo implements ceve {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorHandler");
    private final /* synthetic */ ceur b;
    private final cins c;
    private final ffbr d;

    public avzo(ffsk ffskVar, avzn avznVar, cins cinsVar, ffbr ffbrVar) {
        ffskVar.getClass();
        cinsVar.getClass();
        ffbrVar.getClass();
        eyhz parserForType = avzq.a.getParserForType();
        parserForType.getClass();
        this.b = new ceur(ffskVar, parserForType, new avzi(avznVar, null));
        this.c = cinsVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.c((int) ((Number) this.d.b()).longValue());
        l.b(cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        l.f(poa.EXPONENTIAL);
        ((ceti) l).b = this.c.b();
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("FileTransferProcessorHandler");
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
