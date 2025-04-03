package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcek extends eyfy implements eyht {
    public static final fcek a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public eyee e = eyee.b;

    static {
        fcek fcekVar = new fcek();
        a = fcekVar;
        eyfy.registerDefaultInstance(fcek.class, fcekVar);
    }

    private fcek() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0006\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fcek();
        }
        if (ordinal == 4) {
            return new fcej();
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
        synchronized (fcek.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
