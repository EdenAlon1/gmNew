package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrm extends eyfy implements eyht {
    public static final eqrm a;
    private static volatile eyhz f;
    public int b;
    public fjay c;
    public int d;
    public eqxi e;

    static {
        eqrm eqrmVar = new eqrm();
        a = eqrmVar;
        eyfy.registerDefaultInstance(eqrm.class, eqrmVar);
    }

    private eqrm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", eqrl.a, "e"});
        }
        if (ordinal == 3) {
            return new eqrm();
        }
        if (ordinal == 4) {
            return new eqrk();
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
        synchronized (eqrm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
