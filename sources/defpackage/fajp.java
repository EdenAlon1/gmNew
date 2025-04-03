package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajp extends eyfy implements eyht {
    public static final fajp a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public fahc d;

    static {
        fajp fajpVar = new fajp();
        a = fajpVar;
        eyfy.registerDefaultInstance(fajp.class, fajpVar);
    }

    private fajp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fajp();
        }
        if (ordinal == 4) {
            return new fajo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fajp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
