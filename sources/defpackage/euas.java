package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euas extends eyfy implements eyht {
    public static final euas a;
    private static volatile eyhz f;
    public int b;
    public euau c;
    public int d;
    public eyee e = eyee.b;

    static {
        euas euasVar = new euas();
        a = euasVar;
        eyfy.registerDefaultInstance(euas.class, euasVar);
    }

    private euas() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new euas();
        }
        if (ordinal == 4) {
            return new euar();
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
        synchronized (euas.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
