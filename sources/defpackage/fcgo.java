package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgo extends eyfy implements eyht {
    public static final fcgo a;
    private static volatile eyhz b;
    private int c;
    private fcho d;

    static {
        fcgo fcgoVar = new fcgo();
        a = fcgoVar;
        eyfy.registerDefaultInstance(fcgo.class, fcgoVar);
    }

    private fcgo() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0001", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new fcgo();
        }
        if (ordinal == 4) {
            return new fcgn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcgo.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
