package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglz extends eyfy implements eyht {
    public static final fglz a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public fgly f;

    static {
        fglz fglzVar = new fglz();
        a = fglzVar;
        eyfy.registerDefaultInstance(fglz.class, fglzVar);
    }

    private fglz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", fglw.a, "d", eqmz.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new fglz();
        }
        if (ordinal == 4) {
            return new fglv();
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
        synchronized (fglz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
