package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escu extends eyfy implements eyht {
    public static final escu a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        escu escuVar = new escu();
        a = escuVar;
        eyfy.registerDefaultInstance(escu.class, escuVar);
    }

    private escu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new escu();
        }
        if (ordinal == 4) {
            return new escs();
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
        synchronized (escu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
