package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosz extends eyfy implements eyht {
    public static final cosz a;
    private static volatile eyhz v;
    public int b;
    public int d;
    public int e;
    public int m;
    public boolean o;
    public String c = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String n = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";

    static {
        cosz coszVar = new cosz();
        a = coszVar;
        eyfy.registerDefaultInstance(cosz.class, coszVar);
    }

    private cosz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003င\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bင\n\fለ\u000b\rဇ\f\u000eለ\r\u000fለ\u000e\u0010ለ\u000f\u0011ለ\u0010\u0012ለ\u0011\u0013ለ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u"});
        }
        if (ordinal == 3) {
            return new cosz();
        }
        if (ordinal == 4) {
            return new cosy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = v;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cosz.class) {
            eyhzVar = v;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                v = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
