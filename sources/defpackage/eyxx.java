package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyxx extends eyfy implements eyht {
    public static final eyxx a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public eyxw e;

    static {
        eyxx eyxxVar = new eyxx();
        a = eyxxVar;
        eyfy.registerDefaultInstance(eyxx.class, eyxxVar);
    }

    private eyxx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", eyxu.a, "e"});
        }
        if (ordinal == 3) {
            return new eyxx();
        }
        if (ordinal == 4) {
            return new eyxt();
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
        synchronized (eyxx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
