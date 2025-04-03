package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escr extends eyfy implements eyht {
    public static final escr a;
    private static volatile eyhz j;
    public int b;
    public escu c;
    public boolean d;
    public int g;
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        escr escrVar = new escr();
        a = escrVar;
        eyfy.registerDefaultInstance(escr.class, escrVar);
    }

    private escr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006ለ\u0001\u0007ለ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new escr();
        }
        if (ordinal == 4) {
            return new escq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (escr.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
