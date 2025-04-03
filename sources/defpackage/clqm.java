package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqm extends eyfy implements eyht {
    public static final clqm a;
    private static volatile eyhz f;
    public int b;
    public clsn c;
    public clns d;
    public clpc e;

    static {
        clqm clqmVar = new clqm();
        a = clqmVar;
        eyfy.registerDefaultInstance(clqm.class, clqmVar);
    }

    private clqm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new clqm();
        }
        if (ordinal == 4) {
            return new clql();
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
        synchronized (clqm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
