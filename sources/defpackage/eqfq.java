package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqfq extends eyfy implements eyht {
    public static final eqfq a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        eqfq eqfqVar = new eqfq();
        a = eqfqVar;
        eyfy.registerDefaultInstance(eqfq.class, eqfqVar);
    }

    private eqfq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001e\u0002\u0000\u0000\u0000\u0001ဇ\u0000e<\u0000", new Object[]{"d", "c", "b", "e", eqfs.class});
        }
        if (ordinal == 3) {
            return new eqfq();
        }
        if (ordinal == 4) {
            return new eqfp();
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
        synchronized (eqfq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
