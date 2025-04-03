package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokm extends eyfy implements eyht {
    public static final cokm a;
    private static volatile eyhz d;
    public int b;
    public eyja c;

    static {
        cokm cokmVar = new cokm();
        a = cokmVar;
        eyfy.registerDefaultInstance(cokm.class, cokmVar);
    }

    private cokm() {
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
            return new cokm();
        }
        if (ordinal == 4) {
            return new cokl();
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
        synchronized (cokm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
