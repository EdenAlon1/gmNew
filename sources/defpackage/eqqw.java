package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqqw extends eyfy implements eyht {
    public static final eqqw a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public String f = "";

    static {
        eqqw eqqwVar = new eqqw();
        a = eqqwVar;
        eyfy.registerDefaultInstance(eqqw.class, eqqwVar);
    }

    private eqqw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", edfa.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new eqqw();
        }
        if (ordinal == 4) {
            return new eqqv();
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
        synchronized (eqqw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
