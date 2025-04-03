package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exgx extends eyfy implements eyht {
    public static final exgx a;
    private static volatile eyhz e;
    public int b;
    public fauu c;
    public double d;

    static {
        exgx exgxVar = new exgx();
        a = exgxVar;
        eyfy.registerDefaultInstance(exgx.class, exgxVar);
    }

    private exgx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new exgx();
        }
        if (ordinal == 4) {
            return new exgw();
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
        synchronized (exgx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
