package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esev extends eyfy implements eyht {
    public static final esev a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public long d;

    static {
        esev esevVar = new esev();
        a = esevVar;
        eyfy.registerDefaultInstance(esev.class, esevVar);
    }

    private esev() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esev();
        }
        if (ordinal == 4) {
            return new eseu();
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
        synchronized (esev.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
