package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esof extends eyfy implements eyht {
    public static final esof a;
    private static volatile eyhz f;
    public int b;
    public esoh d;
    public String c = "";
    public String e = "";

    static {
        esof esofVar = new esof();
        a = esofVar;
        eyfy.registerDefaultInstance(esof.class, esofVar);
    }

    private esof() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new esof();
        }
        if (ordinal == 4) {
            return new esoe();
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
        synchronized (esof.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
