package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcig extends eyfy implements eyht {
    public static final fcig a;
    private static volatile eyhz e;
    public int b;
    public fcfo c;
    public int d;

    static {
        fcig fcigVar = new fcig();
        a = fcigVar;
        eyfy.registerDefaultInstance(fcig.class, fcigVar);
    }

    private fcig() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (ordinal == 3) {
            return new fcig();
        }
        if (ordinal == 4) {
            return new fcif();
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
        synchronized (fcig.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
