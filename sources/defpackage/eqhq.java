package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhq extends eyfy implements eyht {
    public static final eqhq a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public long f;

    static {
        eqhq eqhqVar = new eqhq();
        a = eqhqVar;
        eyfy.registerDefaultInstance(eqhq.class, eqhqVar);
    }

    private eqhq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဂ\u0000\u0004ဂ\u0001", new Object[]{"d", "c", "b", eqhp.class, eqhi.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new eqhq();
        }
        if (ordinal == 4) {
            return new eqhd();
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
        synchronized (eqhq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
