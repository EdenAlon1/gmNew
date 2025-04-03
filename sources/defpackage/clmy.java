package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmy extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/messaging/handler/PostIncomingMessageToChatApiHandler");
    public final avkh b;
    public final clie c;
    private final ffbr d;
    private final ffbr e;
    private final ffsk f;

    public clmy(avkh avkhVar, ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, clie clieVar) {
        avkhVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        this.b = avkhVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffskVar;
        this.c = clieVar;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        ffbr ffbrVar = this.d;
        cetx l = cety.l();
        l.c((int) ((Number) ffbrVar.b()).longValue());
        Object b = this.e.b();
        b.getClass();
        l.g(((Number) b).longValue());
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("PostIncomingMessageToChatApiHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = awxk.b.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        awxk awxkVar = (awxk) eyhsVar;
        awxkVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new clmx(awxkVar, this, null));
        return c;
    }
}
