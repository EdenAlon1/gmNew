package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyb extends eyfy implements eyht {
    public static final eqyb a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        eqyb eqybVar = new eqyb();
        a = eqybVar;
        eyfy.registerDefaultInstance(eqyb.class, eqybVar);
    }

    private eqyb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0001\u0002ဈ\u0000\u0003ဇ\u0002", new Object[]{"b", "d", "c", "e"});
        }
        if (ordinal == 3) {
            return new eqyb();
        }
        if (ordinal == 4) {
            return new eqya();
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
        synchronized (eqyb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
