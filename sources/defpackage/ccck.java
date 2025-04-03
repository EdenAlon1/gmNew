package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccck extends eyfy implements eyht {
    public static final ccck a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public int g;
    public eyja h;
    public ccch i;
    public boolean j;

    static {
        ccck ccckVar = new ccck();
        a = ccckVar;
        eyfy.registerDefaultInstance(ccck.class, ccckVar);
    }

    private ccck() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006င\u0005\u0007ဉ\u0006\bဉ\u0007\tဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new ccck();
        }
        if (ordinal == 4) {
            return new cccf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ccck.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
