package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awzq extends eyfy implements eyht {
    public static final awzq a;
    private static volatile eyhz d;
    public int b;
    public eyja c;

    static {
        awzq awzqVar = new awzq();
        a = awzqVar;
        eyfy.registerDefaultInstance(awzq.class, awzqVar);
    }

    private awzq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new awzq();
        }
        if (ordinal == 4) {
            return new awzp();
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
        synchronized (awzq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
