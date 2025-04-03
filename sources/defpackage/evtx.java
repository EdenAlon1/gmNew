package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evtx extends eyfy implements eyht {
    public static final evtx a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyev d;

    static {
        evtx evtxVar = new evtx();
        a = evtxVar;
        eyfy.registerDefaultInstance(evtx.class, evtxVar);
    }

    private evtx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new evtx();
        }
        if (ordinal == 4) {
            return new evtw();
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
        synchronized (evtx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
