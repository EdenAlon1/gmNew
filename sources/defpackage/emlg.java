package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlg extends eyfy implements eyht {
    public static final emlg a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public emhv d;
    public int e;
    public int f;

    static {
        emlg emlgVar = new emlg();
        a = emlgVar;
        eyfy.registerDefaultInstance(emlg.class, emlgVar);
    }

    private emlg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new emlg();
        }
        if (ordinal == 4) {
            return new emlf();
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
        synchronized (emlg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
