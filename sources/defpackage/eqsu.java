package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsu extends eyfy implements eyht {
    public static final eqsu a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;
    private boolean g;

    static {
        eqsu eqsuVar = new eqsu();
        a = eqsuVar;
        eyfy.registerDefaultInstance(eqsu.class, eqsuVar);
    }

    private eqsu() {
    }

    public static /* synthetic */ void a(eqsu eqsuVar) {
        eqsuVar.b |= 8;
        eqsuVar.g = true;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003", new Object[]{"b", "c", eqta.a, "d", eqtf.a, "e", eqtb.a, "g"});
        }
        if (ordinal == 3) {
            return new eqsu();
        }
        if (ordinal == 4) {
            return new eqst();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqsu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
