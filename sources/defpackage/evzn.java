package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evzn extends eyfy implements eyht {
    public static final evzn a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public evwv d;
    public evxy e;

    static {
        evzn evznVar = new evzn();
        a = evznVar;
        eyfy.registerDefaultInstance(evzn.class, evznVar);
    }

    private evzn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", evzl.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new evzn();
        }
        if (ordinal == 4) {
            return new evzk();
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
        synchronized (evzn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
