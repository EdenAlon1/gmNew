package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eumb extends eyfy implements eyht {
    public static final eumb a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        eumb eumbVar = new eumb();
        a = eumbVar;
        eyfy.registerDefaultInstance(eumb.class, eumbVar);
    }

    private eumb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0006\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eumb();
        }
        if (ordinal == 4) {
            return new euma();
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
        synchronized (eumb.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
