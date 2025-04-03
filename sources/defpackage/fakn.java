package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fakn extends eyfy implements eyht {
    public static final fakn a;
    private static volatile eyhz e;
    public int b;
    public fagz c;
    public int d;

    static {
        fakn faknVar = new fakn();
        a = faknVar;
        eyfy.registerDefaultInstance(fakn.class, faknVar);
    }

    private fakn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fakn();
        }
        if (ordinal == 4) {
            return new fakl();
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
        synchronized (fakn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
