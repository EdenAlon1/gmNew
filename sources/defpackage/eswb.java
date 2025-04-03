package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswb extends eyfy implements eyht {
    public static final eswb a;
    private static volatile eyhz c;
    public eyja b;
    private int d;

    static {
        eswb eswbVar = new eswb();
        a = eswbVar;
        eyfy.registerDefaultInstance(eswb.class, eswbVar);
    }

    private eswb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eswb();
        }
        if (ordinal == 4) {
            return new eswa();
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
        synchronized (eswb.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
