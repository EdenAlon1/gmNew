package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuue extends eyfy implements eyht {
    public static final cuue a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        cuue cuueVar = new cuue();
        a = cuueVar;
        eyfy.registerDefaultInstance(cuue.class, cuueVar);
    }

    private cuue() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cuue();
        }
        if (ordinal == 4) {
            return new cuud();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cuue.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
