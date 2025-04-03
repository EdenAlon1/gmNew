package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnn extends eyfy implements eyht {
    public static final eqnn a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        eqnn eqnnVar = new eqnn();
        a = eqnnVar;
        eyfy.registerDefaultInstance(eqnn.class, eqnnVar);
    }

    private eqnn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", eqnm.a});
        }
        if (ordinal == 3) {
            return new eqnn();
        }
        if (ordinal == 4) {
            return new eqnl();
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
        synchronized (eqnn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
