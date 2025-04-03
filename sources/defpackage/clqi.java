package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clqi extends eyfy implements eyht {
    public static final clqi a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public clns e;

    static {
        clqi clqiVar = new clqi();
        a = clqiVar;
        eyfy.registerDefaultInstance(clqi.class, clqiVar);
    }

    private clqi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000", new Object[]{"d", "c", "b", "e", clot.class, clov.class});
        }
        if (ordinal == 3) {
            return new clqi();
        }
        if (ordinal == 4) {
            return new clqh();
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
        synchronized (clqi.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
