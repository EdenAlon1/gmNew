package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqos extends eyfy implements eyht {
    public static final eqos a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        eqos eqosVar = new eqos();
        a = eqosVar;
        eyfy.registerDefaultInstance(eqos.class, eqosVar);
    }

    private eqos() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eqoq.a});
        }
        if (ordinal == 3) {
            return new eqos();
        }
        if (ordinal == 4) {
            return new eqor();
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
        synchronized (eqos.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
