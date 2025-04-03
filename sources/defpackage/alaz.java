package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alaz extends eyfy implements eyht {
    public static final alaz a;
    private static volatile eyhz e;
    public double b;
    public int c;
    public int d;
    private int f;

    static {
        alaz alazVar = new alaz();
        a = alazVar;
        eyfy.registerDefaultInstance(alaz.class, alazVar);
    }

    private alaz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new alaz();
        }
        if (ordinal == 4) {
            return new alay();
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
        synchronized (alaz.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
