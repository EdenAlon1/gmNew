package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgi extends eyfy implements eyht {
    public static final fcgi a;
    private static volatile eyhz f;
    public int b;
    public fcfo c;
    public fcek d;
    public eygr e = emptyProtobufList();

    static {
        fcgi fcgiVar = new fcgi();
        a = fcgiVar;
        eyfy.registerDefaultInstance(fcgi.class, fcgiVar);
    }

    private fcgi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", fcek.class});
        }
        if (ordinal == 3) {
            return new fcgi();
        }
        if (ordinal == 4) {
            return new fcgh();
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
        synchronized (fcgi.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
