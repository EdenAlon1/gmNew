package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgq extends eyfy implements eyht {
    public static final fcgq a;
    private static volatile eyhz g;
    public int b;
    public fcek c;
    public long d;
    public fcho e;
    public fces f;

    static {
        fcgq fcgqVar = new fcgq();
        a = fcgqVar;
        eyfy.registerDefaultInstance(fcgq.class, fcgqVar);
    }

    private fcgq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fcgq();
        }
        if (ordinal == 4) {
            return new fcgp();
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
        synchronized (fcgq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
