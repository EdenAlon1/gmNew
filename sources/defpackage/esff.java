package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esff extends eyfy implements eyht {
    public static final esff a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        esff esffVar = new esff();
        a = esffVar;
        eyfy.registerDefaultInstance(esff.class, esffVar);
    }

    private esff() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new esff();
        }
        if (ordinal == 4) {
            return new esfe();
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
        synchronized (esff.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
