package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcs extends eyfy implements eyht {
    public static final eqcs a;
    private static volatile eyhz f;
    public int b;
    public eqco c;
    public int d;
    public int e;

    static {
        eqcs eqcsVar = new eqcs();
        a = eqcsVar;
        eyfy.registerDefaultInstance(eqcs.class, eqcsVar);
    }

    private eqcs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", eqcq.a, "e", eqcr.a});
        }
        if (ordinal == 3) {
            return new eqcs();
        }
        if (ordinal == 4) {
            return new eqcp();
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
        synchronized (eqcs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
