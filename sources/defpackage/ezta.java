package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezta extends eyfy implements eyht {
    public static final ezta a;
    private static volatile eyhz b;

    static {
        ezta eztaVar = new ezta();
        a = eztaVar;
        eyfy.registerDefaultInstance(ezta.class, eztaVar);
    }

    private ezta() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0000", null);
        }
        if (ordinal == 3) {
            return new ezta();
        }
        if (ordinal == 4) {
            return new ezsz();
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
        synchronized (ezta.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
