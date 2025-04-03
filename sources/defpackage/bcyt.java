package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyt extends eyfy implements eyht {
    public static final bcyt a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        bcyt bcytVar = new bcyt();
        a = bcytVar;
        eyfy.registerDefaultInstance(bcyt.class, bcytVar);
    }

    private bcyt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002င\u0000\u0003\u0004", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new bcyt();
        }
        if (ordinal == 4) {
            return new bcys();
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
        synchronized (bcyt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
