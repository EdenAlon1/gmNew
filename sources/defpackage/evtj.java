package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evtj extends eyfy implements eyht {
    public static final evtj a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eyja d;

    static {
        evtj evtjVar = new evtj();
        a = evtjVar;
        eyfy.registerDefaultInstance(evtj.class, evtjVar);
    }

    private evtj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new evtj();
        }
        if (ordinal == 4) {
            return new evti();
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
        synchronized (evtj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
