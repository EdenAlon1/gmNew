package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqq extends eyfy implements eyht {
    public static final clqq a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        clqq clqqVar = new clqq();
        a = clqqVar;
        eyfy.registerDefaultInstance(clqq.class, clqqVar);
    }

    private clqq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new clqq();
        }
        if (ordinal == 4) {
            return new clqp();
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
        synchronized (clqq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
