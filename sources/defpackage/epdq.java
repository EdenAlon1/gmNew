package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epdq extends eyfy implements eyht {
    public static final epdq a;
    private static volatile eyhz g;
    public int b;
    public eoqk c;
    public int d;
    public int e;
    public int f;

    static {
        epdq epdqVar = new epdq();
        a = epdqVar;
        eyfy.registerDefaultInstance(epdq.class, epdqVar);
    }

    private epdq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", epdp.a});
        }
        if (ordinal == 3) {
            return new epdq();
        }
        if (ordinal == 4) {
            return new epdo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epdq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
