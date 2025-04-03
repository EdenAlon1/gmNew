package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdu extends eyfy implements eyht {
    public static final fcdu a;
    private static volatile eyhz d;
    public eyee b = eyee.b;
    public long c;

    static {
        fcdu fcduVar = new fcdu();
        a = fcduVar;
        eyfy.registerDefaultInstance(fcdu.class, fcduVar);
    }

    private fcdu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcdu();
        }
        if (ordinal == 4) {
            return new fcdt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcdu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
