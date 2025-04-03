package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epex extends eyfy implements eyht {
    public static final epex a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public long d;
    public int e;

    static {
        epex epexVar = new epex();
        a = epexVar;
        eyfy.registerDefaultInstance(epex.class, epexVar);
    }

    private epex() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", epew.a});
        }
        if (ordinal == 3) {
            return new epex();
        }
        if (ordinal == 4) {
            return new epev();
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
        synchronized (epex.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
