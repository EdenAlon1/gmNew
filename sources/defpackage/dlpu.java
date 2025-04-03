package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpu extends eyfy implements eyht {
    public static final dlpu a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        dlpu dlpuVar = new dlpu();
        a = dlpuVar;
        eyfy.registerDefaultInstance(dlpu.class, dlpuVar);
    }

    private dlpu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0014\u0014\u0001\u0000\u0000\u0000\u0014ဈ\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new dlpu();
        }
        if (ordinal == 4) {
            return new dlpt();
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
        synchronized (dlpu.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
