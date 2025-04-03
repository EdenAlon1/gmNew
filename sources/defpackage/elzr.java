package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elzr extends eyfy implements eyht {
    public static final elzr a;
    private static volatile eyhz d;
    public int b;
    public emac c;

    static {
        elzr elzrVar = new elzr();
        a = elzrVar;
        eyfy.registerDefaultInstance(elzr.class, elzrVar);
    }

    private elzr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new elzr();
        }
        if (ordinal == 4) {
            return new elzq();
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
        synchronized (elzr.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
