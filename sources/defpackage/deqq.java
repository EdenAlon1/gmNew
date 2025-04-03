package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deqq extends eyfy implements eyht {
    public static final deqq a;
    private static volatile eyhz b;

    static {
        deqq deqqVar = new deqq();
        a = deqqVar;
        eyfy.registerDefaultInstance(deqq.class, deqqVar);
    }

    private deqq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new deqq();
        }
        if (ordinal == 4) {
            return new deqp();
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
        synchronized (deqq.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
