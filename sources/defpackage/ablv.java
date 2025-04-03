package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablv extends eyfy implements eyht {
    public static final ablv a;
    private static volatile eyhz d;
    public boolean b;
    public long c;

    static {
        ablv ablvVar = new ablv();
        a = ablvVar;
        eyfy.registerDefaultInstance(ablv.class, ablvVar);
    }

    private ablv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0002", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ablv();
        }
        if (ordinal == 4) {
            return new ablu();
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
        synchronized (ablv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
