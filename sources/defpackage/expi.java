package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class expi extends eyfy implements eyht {
    public static final expi a;
    public static final eyfw b;
    private static volatile eyhz g;
    public int c;
    public exoh d;
    public String e = "en";
    public expk f;

    static {
        expi expiVar = new expi();
        a = expiVar;
        eyfy.registerDefaultInstance(expi.class, expiVar);
        b = eyfy.newSingularGeneratedExtension(eula.a, expiVar, expiVar, null, 458105758, eyjr.MESSAGE, expi.class);
    }

    private expi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new expi();
        }
        if (ordinal == 4) {
            return new exph();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (expi.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
