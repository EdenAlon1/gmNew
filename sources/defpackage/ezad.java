package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezad extends eyfy implements eyht {
    public static final ezad a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ezad ezadVar = new ezad();
        a = ezadVar;
        eyfy.registerDefaultInstance(ezad.class, ezadVar);
    }

    private ezad() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", ezak.class, ezab.class, ezbl.class, ezau.class, ezaz.class});
        }
        if (ordinal == 3) {
            return new ezad();
        }
        if (ordinal == 4) {
            return new ezac();
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
        synchronized (ezad.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
