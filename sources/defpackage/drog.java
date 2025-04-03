package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drog extends eyfy implements eyht {
    public static final drog a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        drog drogVar = new drog();
        a = drogVar;
        eyfy.registerDefaultInstance(drog.class, drogVar);
    }

    private drog() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", drod.class, drof.class});
        }
        if (ordinal == 3) {
            return new drog();
        }
        if (ordinal == 4) {
            return new drob();
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
        synchronized (drog.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
