package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnu extends eyfy implements eyht {
    public static final clnu a;
    private static volatile eyhz f;
    public int b;
    public eydq c;
    public clqc d;
    public clns e;

    static {
        clnu clnuVar = new clnu();
        a = clnuVar;
        eyfy.registerDefaultInstance(clnu.class, clnuVar);
    }

    private clnu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new clnu();
        }
        if (ordinal == 4) {
            return new clnt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (clnu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
