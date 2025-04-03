package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdc extends eyfy implements eyht {
    public static final fcdc a;
    private static volatile eyhz e;
    public int b;
    public fcfo c;
    public fcek d;

    static {
        fcdc fcdcVar = new fcdc();
        a = fcdcVar;
        eyfy.registerDefaultInstance(fcdc.class, fcdcVar);
    }

    private fcdc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcdc();
        }
        if (ordinal == 4) {
            return new fcdb();
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
        synchronized (fcdc.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
