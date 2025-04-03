package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcka extends eyfy implements eyht {
    public static final fcka a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        fcka fckaVar = new fcka();
        a = fckaVar;
        eyfy.registerDefaultInstance(fcka.class, fckaVar);
    }

    private fcka() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0000\u0000\u0000\u0002\f\u0004Ȉ\u0005\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcka();
        }
        if (ordinal == 4) {
            return new fcjz();
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
        synchronized (fcka.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
