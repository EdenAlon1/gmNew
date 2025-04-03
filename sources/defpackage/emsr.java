package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsr extends eyfy implements eyht {
    public static final emsr a;
    private static volatile eyhz c;
    public long b;

    static {
        emsr emsrVar = new emsr();
        a = emsrVar;
        eyfy.registerDefaultInstance(emsr.class, emsrVar);
    }

    private emsr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new emsr();
        }
        if (ordinal == 4) {
            return new emsq();
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
        synchronized (emsr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
