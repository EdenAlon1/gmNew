package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clns extends eyfy implements eyht {
    public static final clns a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public clqv d;
    public clqs e;

    static {
        clns clnsVar = new clns();
        a = clnsVar;
        eyfy.registerDefaultInstance(clns.class, clnsVar);
    }

    private clns() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", clnq.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new clns();
        }
        if (ordinal == 4) {
            return new clnp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clns.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
