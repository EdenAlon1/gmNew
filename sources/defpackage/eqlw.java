package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqlw extends eyfy implements eyht {
    public static final eqlw a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        eqlw eqlwVar = new eqlw();
        a = eqlwVar;
        eyfy.registerDefaultInstance(eqlw.class, eqlwVar);
    }

    private eqlw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", eqlv.a, "d", dtff.a});
        }
        if (ordinal == 3) {
            return new eqlw();
        }
        if (ordinal == 4) {
            return new eqlu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqlw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
