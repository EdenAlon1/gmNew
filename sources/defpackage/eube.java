package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eube extends eyfy implements eyht {
    public static final eube a;
    private static volatile eyhz c;
    public int b;

    static {
        eube eubeVar = new eube();
        a = eubeVar;
        eyfy.registerDefaultInstance(eube.class, eubeVar);
    }

    private eube() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new eube();
        }
        if (ordinal == 4) {
            return new eubd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eube.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
