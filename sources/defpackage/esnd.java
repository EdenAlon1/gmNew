package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnd extends eyfy implements eyht {
    public static final esnd a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public eslw e;

    static {
        esnd esndVar = new esnd();
        a = esndVar;
        eyfy.registerDefaultInstance(esnd.class, esndVar);
    }

    private esnd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new esnd();
        }
        if (ordinal == 4) {
            return new esnc();
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
        synchronized (esnd.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
