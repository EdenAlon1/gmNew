package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rte extends eyfy implements eyht {
    public static final rte a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public int d;

    static {
        rte rteVar = new rte();
        a = rteVar;
        eyfy.registerDefaultInstance(rte.class, rteVar);
    }

    private rte() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", rud.a});
        }
        if (ordinal == 3) {
            return new rte();
        }
        if (ordinal == 4) {
            return new rtd();
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
        synchronized (rte.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
