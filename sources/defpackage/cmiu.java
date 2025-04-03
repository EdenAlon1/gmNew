package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmiu extends eyfy implements eyht {
    public static final cmiu a;
    public static final eygm f = new eygm(cmis.f, cmis.PER_SIM_TOGGLE_STATE_UNSPECIFIED);
    private static volatile eyhz g;
    public int b;
    public eyhm c = eyhm.a;
    public cmim d;
    public int e;

    static {
        cmiu cmiuVar = new cmiu();
        a = cmiuVar;
        eyfy.registerDefaultInstance(cmiu.class, cmiuVar);
    }

    private cmiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0001\u0000\u0000\u0002࠲\u0003ဉ\u0000\u0004᠌\u0001", new Object[]{"b", "c", cmit.a, cmir.a, "d", "e", cmio.a});
        }
        if (ordinal == 3) {
            return new cmiu();
        }
        if (ordinal == 4) {
            return new cmin();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cmiu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
