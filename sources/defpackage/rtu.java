package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtu extends eyfy implements eyht {
    public static final rtu a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        rtu rtuVar = new rtu();
        a = rtuVar;
        eyfy.registerDefaultInstance(rtu.class, rtuVar);
    }

    private rtu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new rtu();
        }
        if (ordinal == 4) {
            return new rtt();
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
        synchronized (rtu.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
