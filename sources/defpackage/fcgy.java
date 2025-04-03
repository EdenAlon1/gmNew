package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgy extends eyfy implements eyht {
    public static final fcgy a;
    private static volatile eyhz h;
    public int b;
    public fcfo c;
    public fcek d;
    public fcey e;
    public eygr f = emptyProtobufList();
    public int g;

    static {
        fcgy fcgyVar = new fcgy();
        a = fcgyVar;
        eyfy.registerDefaultInstance(fcgy.class, fcgyVar);
    }

    private fcgy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0007\f", new Object[]{"b", "c", "d", "e", "f", fcek.class, "g"});
        }
        if (ordinal == 3) {
            return new fcgy();
        }
        if (ordinal == 4) {
            return new fcgx();
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
        synchronized (fcgy.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
