package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusr extends eyfy implements eyht {
    public static final cusr a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        cusr cusrVar = new cusr();
        a = cusrVar;
        eyfy.registerDefaultInstance(cusr.class, cusrVar);
    }

    private cusr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cusr();
        }
        if (ordinal == 4) {
            return new cusq();
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
        synchronized (cusr.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
