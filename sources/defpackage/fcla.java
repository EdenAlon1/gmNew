package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcla extends eyfy implements eyht {
    public static final fcla a;
    private static volatile eyhz h;
    public int b;
    public fcfo c;
    public eygr d = emptyProtobufList();
    public int e;
    public int f;
    public boolean g;

    static {
        fcla fclaVar = new fcla();
        a = fclaVar;
        eyfy.registerDefaultInstance(fcla.class, fclaVar);
    }

    private fcla() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u0004\u0004\u0004\u0005\u0007", new Object[]{"b", "c", "d", fcga.class, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fcla();
        }
        if (ordinal == 4) {
            return new fckz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcla.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
