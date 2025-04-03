package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clpi extends eyfy implements eyht {
    public static final clpi a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        clpi clpiVar = new clpi();
        a = clpiVar;
        eyfy.registerDefaultInstance(clpi.class, clpiVar);
    }

    private clpi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", clpg.a, "d", clpe.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new clpi();
        }
        if (ordinal == 4) {
            return new clpd();
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
        synchronized (clpi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
