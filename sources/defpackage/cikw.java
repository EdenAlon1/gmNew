package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cikw extends ceut {
    public static final cskc a = cskc.g("BugleJobs", "DittoRetryHandler");
    public final fazb b;
    public final ffbr c;
    private final ffbr d;
    private final fazb e;
    private final ffbr f;
    private final ffbr g;
    private final fazb h;
    private final errl i;
    private final errl j;
    private final ffbr k;
    private final chww l;

    public cikw(chww chwwVar, fazb fazbVar, ffbr ffbrVar, fazb fazbVar2, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar3, ffbr ffbrVar4, errl errlVar, errl errlVar2, ffbr ffbrVar5) {
        this.l = chwwVar;
        this.b = fazbVar;
        this.d = ffbrVar;
        this.e = fazbVar2;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = fazbVar3;
        this.c = ffbrVar4;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = ffbrVar5;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(5);
        l.f(poa.EXPONENTIAL);
        l.g(TimeUnit.SECONDS.toMillis(((Integer) bzaq.f.e()).intValue()));
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DittoRetryHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cila.a.getParserForType();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ceut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ defpackage.elfl j(final defpackage.ceuw r7, defpackage.eyhs r8) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cikw.j(ceuw, eyhs):elfl");
    }

    public final void k(ceuw ceuwVar) {
        ((akzt) this.c.b()).e("Bugle.Ditto.RetryHandler.Failure.Count", ((cetk) ceuwVar.a()).c);
    }
}
