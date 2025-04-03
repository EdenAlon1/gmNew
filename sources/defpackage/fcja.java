package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcja extends eyfy implements eyht {
    public static final fcja a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public fcfo e;

    static {
        fcja fcjaVar = new fcja();
        a = fcjaVar;
        eyfy.registerDefaultInstance(fcja.class, fcjaVar);
    }

    private fcja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (ordinal == 3) {
            return new fcja();
        }
        if (ordinal == 4) {
            return new fciz();
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
        synchronized (fcja.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
