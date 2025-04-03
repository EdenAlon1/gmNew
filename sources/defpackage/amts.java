package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amts extends eyfy implements eyht {
    public static final amts a;
    private static volatile eyhz n;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;

    static {
        amts amtsVar = new amts();
        a = amtsVar;
        eyfy.registerDefaultInstance(amts.class, amtsVar);
    }

    private amts() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဃ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဃ\t\u000bဃ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (ordinal == 3) {
            return new amts();
        }
        if (ordinal == 4) {
            return new amtr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (amts.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
