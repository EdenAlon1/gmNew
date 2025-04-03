package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbv extends eyfy implements eyht {
    public static final fcbv a;
    private static volatile eyhz i;
    public int b;
    public fcfq c;
    public fcdu d;
    public boolean e;
    public long f;
    public fcfi g;
    public eyee h = eyee.b;

    static {
        fcbv fcbvVar = new fcbv();
        a = fcbvVar;
        eyfy.registerDefaultInstance(fcbv.class, fcbvVar);
    }

    private fcbv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0002\u0006ဉ\u0003\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fcbv();
        }
        if (ordinal == 4) {
            return new fcbu();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcbv.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
