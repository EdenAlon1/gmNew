package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpu extends eyfy implements eyht {
    public static final eqpu a;
    private static volatile eyhz f;
    public int b;
    public eyee c = eyee.b;
    public long d;
    public int e;

    static {
        eqpu eqpuVar = new eqpu();
        a = eqpuVar;
        eyfy.registerDefaultInstance(eqpu.class, eqpuVar);
    }

    private eqpu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", eqpt.a});
        }
        if (ordinal == 3) {
            return new eqpu();
        }
        if (ordinal == 4) {
            return new eqps();
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
        synchronized (eqpu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
