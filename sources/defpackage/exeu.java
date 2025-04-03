package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exeu extends eyfy implements eyht {
    public static final exeu a;
    public static final eyfw b;
    private static volatile eyhz e;
    public int c;
    public exel d;

    static {
        exeu exeuVar = new exeu();
        a = exeuVar;
        eyfy.registerDefaultInstance(exeu.class, exeuVar);
        b = eyfy.newSingularGeneratedExtension(epoa.a, exeuVar, exeuVar, null, 549, eyjr.MESSAGE, exeu.class);
    }

    private exeu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new exeu();
        }
        if (ordinal == 4) {
            return new exet();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exeu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
