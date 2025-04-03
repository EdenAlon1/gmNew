package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzq extends eyfy implements eyht {
    public static final epzq a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public eprl e;
    public boolean f;

    static {
        epzq epzqVar = new epzq();
        a = epzqVar;
        eyfy.registerDefaultInstance(epzq.class, epzqVar);
    }

    private epzq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", epzp.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new epzq();
        }
        if (ordinal == 4) {
            return new epzo();
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
        synchronized (epzq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
