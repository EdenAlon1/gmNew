package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezju extends eyfy implements eyht {
    public static final ezju a;
    private static volatile eyhz c;
    public String b = "";
    private int d;

    static {
        ezju ezjuVar = new ezju();
        a = ezjuVar;
        eyfy.registerDefaultInstance(ezju.class, ezjuVar);
    }

    private ezju() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new ezju();
        }
        if (ordinal == 4) {
            return new ezjt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezju.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
