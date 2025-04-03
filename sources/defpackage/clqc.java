package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqc extends eyfy implements eyht {
    public static final clqc a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public clrl e;
    public int f;

    static {
        clqc clqcVar = new clqc();
        a = clqcVar;
        eyfy.registerDefaultInstance(clqc.class, clqcVar);
    }

    private clqc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\b᠌\u0003", new Object[]{"b", "c", clof.a, "d", clod.a, "e", "f", clqa.a});
        }
        if (ordinal == 3) {
            return new clqc();
        }
        if (ordinal == 4) {
            return new clpz();
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
        synchronized (clqc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
