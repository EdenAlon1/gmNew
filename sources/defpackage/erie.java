package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erie extends eyfy implements eyht {
    public static final erie a;
    private static volatile eyhz l;
    public int b;
    public int d;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public boolean k;
    public String c = "";
    public String e = "";
    public String j = "";

    static {
        erie erieVar = new erie();
        a = erieVar;
        eyfy.registerDefaultInstance(erie.class, erieVar);
    }

    private erie() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဈ\u0007\bင\u0004\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
        }
        if (ordinal == 3) {
            return new erie();
        }
        if (ordinal == 4) {
            return new erid();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erie.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
