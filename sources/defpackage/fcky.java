package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcky extends eyfy implements eyht {
    public static final fcky a;
    private static volatile eyhz c;
    public int b;

    static {
        fcky fckyVar = new fcky();
        a = fckyVar;
        eyfy.registerDefaultInstance(fcky.class, fckyVar);
    }

    private fcky() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fcky();
        }
        if (ordinal == 4) {
            return new fckx();
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
        synchronized (fcky.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
