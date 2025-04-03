package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpu extends eyfy implements eyht {
    public static final fbpu a;
    private static volatile eyhz b;

    static {
        fbpu fbpuVar = new fbpu();
        a = fbpuVar;
        eyfy.registerDefaultInstance(fbpu.class, fbpuVar);
    }

    private fbpu() {
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
            return new fbpu();
        }
        if (ordinal == 4) {
            return new fbpt();
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
        synchronized (fbpu.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
