package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evye extends eyfy implements eyht {
    public static final evye a;
    private static volatile eyhz e;
    public int b;
    public evsp c;
    public int d;

    static {
        evye evyeVar = new evye();
        a = evyeVar;
        eyfy.registerDefaultInstance(evye.class, evyeVar);
    }

    private evye() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", evyc.a});
        }
        if (ordinal == 3) {
            return new evye();
        }
        if (ordinal == 4) {
            return new evyb();
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
        synchronized (evye.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
