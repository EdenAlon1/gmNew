package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzb implements aqbq {
    public static final long a;
    public static final Duration b;
    public final ffbr c;
    private final ffsk d;
    private final cqor e;

    static {
        long j = ffpw.a;
        a = ffpy.d(2, ffpz.d);
        b = Duration.ofSeconds(8L);
    }

    public anzb(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        this.d = ffskVar;
        this.c = ffbrVar;
        this.e = new cqoq("SuggestionBugleSendMessageListener::onMessageSent");
    }

    @Override // defpackage.aqbq
    public final ekzz a() {
        return this.e.a();
    }

    @Override // defpackage.aqbq
    public final elfl b(apro aproVar) {
        aproVar.getClass();
        if (!((Boolean) ((cfup) ctjd.bK.get()).e()).booleanValue() && aproVar.f() != null) {
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        axol.k(this.d, null, new anza(this, aproVar, null), 3);
        elfl e2 = elfo.e(null);
        e2.getClass();
        return e2;
    }
}
