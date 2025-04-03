package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsd extends eyfy implements eyht {
    public static final eqsd a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public int d;
    public int i;
    public boolean j;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";

    static {
        eqsd eqsdVar = new eqsd();
        a = eqsdVar;
        eyfy.registerDefaultInstance(eqsd.class, eqsdVar);
    }

    private eqsd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ለ\u0002\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bင\u0007\tဇ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new eqsd();
        }
        if (ordinal == 4) {
            return new eqsc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqsd.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
