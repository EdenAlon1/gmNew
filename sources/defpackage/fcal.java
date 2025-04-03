package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcal extends eyfy implements eyht {
    public static final fcal a;
    private static volatile eyhz f;
    public int b;
    public fcfo c;
    public eygr d = emptyProtobufList();
    public int e;

    static {
        fcal fcalVar = new fcal();
        a = fcalVar;
        eyfy.registerDefaultInstance(fcal.class, fcalVar);
    }

    private fcal() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004", new Object[]{"b", "c", "d", fcek.class, "e"});
        }
        if (ordinal == 3) {
            return new fcal();
        }
        if (ordinal == 4) {
            return new fcak();
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
        synchronized (fcal.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
