package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cplr extends ceut {
    private final Map a;
    private final ffbr b;
    private final ffbr c;
    private final ffsk d;
    private final enru e;

    public cplr(Map map, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.a = map;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffskVar;
        this.e = enru.c("com/google/android/apps/messaging/shared/tachygram/chat/TachygramInboxMessageRetryWorkHandler");
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.b;
        cetx l = cety.l();
        l.c((int) ((Number) ffbrVar.b()).longValue());
        Object b = this.c.b();
        b.getClass();
        l.g(((Number) b).longValue());
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("TachygramInboxMessageRetryWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = fbzt.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        fbzt fbztVar = (fbzt) eyhsVar;
        fbztVar.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cplq(this, fbztVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fbzt r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cplr.k(fbzt, ffgu):java.lang.Object");
    }
}
