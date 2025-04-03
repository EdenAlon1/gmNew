package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmc extends eyfy implements eyht {
    public static final fgmc a;
    private static volatile eyhz i;
    public int b;
    public int e;
    public int h;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        fgmc fgmcVar = new fgmc();
        a = fgmcVar;
        eyfy.registerDefaultInstance(fgmc.class, fgmcVar);
    }

    private fgmc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", fgma.a, "f", "g", "h", eqwe.a});
        }
        if (ordinal == 3) {
            return new fgmc();
        }
        if (ordinal == 4) {
            return new fgmb();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgmc.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
