package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awpn extends ceut {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingGroupNotificationListRequestHandler");
    public final awnv a;
    public final azfv b;
    public final ffbr c;
    private final akvz e;
    private final ffsk f;
    private final akzt g;

    public awpn(awnv awnvVar, akvz akvzVar, ffsk ffskVar, azfv azfvVar, akzt akztVar, ffbr ffbrVar) {
        akvzVar.getClass();
        ffskVar.getClass();
        azfvVar.getClass();
        akztVar.getClass();
        ffbrVar.getClass();
        this.a = awnvVar;
        this.e = akvzVar;
        this.f = ffskVar;
        this.b = azfvVar;
        this.g = akztVar;
        this.c = ffbrVar;
    }

    private final azfl m(azfh azfhVar) {
        Instant instant = Instant.EPOCH;
        instant.getClass();
        return azfl.a((azfl) azfhVar.d, null, null, null, null, null, null, instant, 39);
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("IncomingGroupNotificationListRequestHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = awxu.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        awxu awxuVar = (awxu) eyhsVar;
        awxuVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new awpm(awxuVar, this, null));
        return c;
    }

    public final cfkl k(String str) {
        cetp cetpVar = new cetp();
        cetpVar.a = String.valueOf(this.e.c(str));
        return cetpVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2 A[LOOP:0: B:12:0x00bc->B:14:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0 A[LOOP:3: B:75:0x01ba->B:77:0x01c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007e A[LOOP:4: B:86:0x0078->B:88:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.util.Set r10, boolean r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awpn.l(java.util.Set, boolean, ffgu):java.lang.Object");
    }
}
