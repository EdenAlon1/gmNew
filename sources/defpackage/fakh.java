package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fakh extends eyfy implements eyht {
    public static final fakh a;
    private static volatile eyhz d;
    public int b;
    public fakg c;

    static {
        fakh fakhVar = new fakh();
        a = fakhVar;
        eyfy.registerDefaultInstance(fakh.class, fakhVar);
    }

    private fakh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fakh();
        }
        if (ordinal == 4) {
            return new fajy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fakh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
