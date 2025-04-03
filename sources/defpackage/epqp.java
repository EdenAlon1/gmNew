package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqp extends eyfy implements eyht {
    public static final epqp a;
    private static volatile eyhz b;

    static {
        epqp epqpVar = new epqp();
        a = epqpVar;
        eyfy.registerDefaultInstance(epqp.class, epqpVar);
    }

    private epqp() {
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
            return new epqp();
        }
        if (ordinal == 4) {
            return new epqo();
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
        synchronized (epqp.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
