package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyu extends eyfy implements eyht {
    public static final epyu a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        epyu epyuVar = new epyu();
        a = epyuVar;
        eyfy.registerDefaultInstance(epyu.class, epyuVar);
    }

    private epyu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new epyu();
        }
        if (ordinal == 4) {
            return new epyt();
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
        synchronized (epyu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
