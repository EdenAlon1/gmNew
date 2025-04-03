package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezrs extends eyfy implements eyht {
    public static final ezrs a;
    private static volatile eyhz b;

    static {
        ezrs ezrsVar = new ezrs();
        a = ezrsVar;
        eyfy.registerDefaultInstance(ezrs.class, ezrsVar);
    }

    private ezrs() {
        emptyProtobufList();
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
            return new ezrs();
        }
        if (ordinal == 4) {
            return new ezrr();
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
        synchronized (ezrs.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
