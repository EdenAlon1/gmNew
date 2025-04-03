package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esif extends eyfy implements eyht {
    public static final esif a;
    private static volatile eyhz g;
    public Object c;
    public boolean e;
    public int f;
    public int b = 0;
    public String d = "";

    static {
        esif esifVar = new esif();
        a = esifVar;
        eyfy.registerDefaultInstance(esif.class, esifVar);
    }

    private esif() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȉ\u0003\u0007\u0004\f\u0005Ȼ\u0000", new Object[]{"c", "b", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new esif();
        }
        if (ordinal == 4) {
            return new esie();
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
        synchronized (esif.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
