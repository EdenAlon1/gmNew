package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fauf extends eyfy implements eyht {
    public static final fauf a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public faud d;

    static {
        fauf faufVar = new fauf();
        a = faufVar;
        eyfy.registerDefaultInstance(fauf.class, faufVar);
    }

    private fauf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001^\u0002\u0000\u0000\u0000\u0001\f^ဉ\u0018", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fauf();
        }
        if (ordinal == 4) {
            return new faue();
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
        synchronized (fauf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
