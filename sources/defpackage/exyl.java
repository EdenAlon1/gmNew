package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exyl extends eyfy implements eyht {
    public static final exyl a;
    private static volatile eyhz d;
    public int b;
    public int c;
    private int e;

    static {
        exyl exylVar = new exyl();
        a = exylVar;
        eyfy.registerDefaultInstance(exyl.class, exylVar);
    }

    private exyl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0004᠌\u0003", new Object[]{"e", "b", exyj.a, "c", exxv.a});
        }
        if (ordinal == 3) {
            return new exyl();
        }
        if (ordinal == 4) {
            return new exyi();
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
        synchronized (exyl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
