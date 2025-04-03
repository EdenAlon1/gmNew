package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbiy extends eyfy implements eyht {
    public static final cbiy a;
    private static volatile eyhz g;
    public int b;
    public long d;
    public long e;
    public String c = "";
    public String f = "";

    static {
        cbiy cbiyVar = new cbiy();
        a = cbiyVar;
        eyfy.registerDefaultInstance(cbiy.class, cbiyVar);
    }

    private cbiy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cbiy();
        }
        if (ordinal == 4) {
            return new cbix();
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
        synchronized (cbiy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
