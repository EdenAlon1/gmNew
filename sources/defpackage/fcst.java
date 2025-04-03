package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcst extends eyfy implements eyht {
    public static final fcst a;
    private static volatile eyhz b;

    static {
        fcst fcstVar = new fcst();
        a = fcstVar;
        eyfy.registerDefaultInstance(fcst.class, fcstVar);
    }

    private fcst() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fcst();
        }
        if (ordinal == 4) {
            return new fcss();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcst.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
