package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eriq extends eyfy implements eyht {
    public static final eriq a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public erie d;
    public int e;
    public int f;

    static {
        eriq eriqVar = new eriq();
        a = eriqVar;
        eyfy.registerDefaultInstance(eriq.class, eriqVar);
    }

    private eriq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", erkc.a, "d", "e", erka.a, "f"});
        }
        if (ordinal == 3) {
            return new eriq();
        }
        if (ordinal == 4) {
            return new erip();
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
        synchronized (eriq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
