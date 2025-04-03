package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsw extends eyfy implements eyht {
    public static final evsw a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public evsp e;

    static {
        evsw evswVar = new evsw();
        a = evswVar;
        eyfy.registerDefaultInstance(evsw.class, evswVar);
    }

    private evsw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", evsv.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new evsw();
        }
        if (ordinal == 4) {
            return new evsu();
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
        synchronized (evsw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
