package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcey extends eyfy implements eyht {
    public static final fcey a;
    private static volatile eyhz g;
    public eyhm f = eyhm.a;
    public String b = "";
    public String c = "";
    public eyee d = eyee.b;
    public eyee e = eyee.b;

    static {
        fcey fceyVar = new fcey();
        a = fceyVar;
        eyfy.registerDefaultInstance(fcey.class, fceyVar);
    }

    private fcey() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0000\u0001\t\u0005\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\b\n\t2", new Object[]{"b", "c", "d", "e", "f", fcex.a});
        }
        if (ordinal == 3) {
            return new fcey();
        }
        if (ordinal == 4) {
            return new fcew();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcey.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
