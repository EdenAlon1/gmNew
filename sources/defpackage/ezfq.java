package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezfq extends eyfy implements eyht {
    public static final ezfq a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public ezfw f;

    static {
        ezfq ezfqVar = new ezfq();
        a = ezfqVar;
        eyfy.registerDefaultInstance(ezfq.class, ezfqVar);
    }

    private ezfq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", "e", ezgf.class, "f"});
        }
        if (ordinal == 3) {
            return new ezfq();
        }
        if (ordinal == 4) {
            return new ezfp();
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
        synchronized (ezfq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
