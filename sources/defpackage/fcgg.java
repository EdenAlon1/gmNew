package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgg extends eyfy implements eyht {
    public static final fcgg a;
    private static volatile eyhz f;
    public fcek b;
    public long c;
    public fcho d;
    public eygr e = emptyProtobufList();
    private int g;

    static {
        fcgg fcggVar = new fcgg();
        a = fcggVar;
        eyfy.registerDefaultInstance(fcgg.class, fcggVar);
    }

    private fcgg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0002\u0003ဉ\u0001\u0004\u001b", new Object[]{"g", "b", "c", "d", "e", fcek.class});
        }
        if (ordinal == 3) {
            return new fcgg();
        }
        if (ordinal == 4) {
            return new fcgf();
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
        synchronized (fcgg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
