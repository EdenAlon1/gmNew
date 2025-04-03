package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eddu extends eyfy implements eyht {
    public static final eddu a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        eddu edduVar = new eddu();
        a = edduVar;
        eyfy.registerDefaultInstance(eddu.class, edduVar);
    }

    private eddu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eddu();
        }
        if (ordinal == 4) {
            return new eddt();
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
        synchronized (eddu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
