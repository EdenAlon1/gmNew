package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezwn extends eyfy implements eyht {
    public static final ezwn a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        ezwn ezwnVar = new ezwn();
        a = ezwnVar;
        eyfy.registerDefaultInstance(ezwn.class, ezwnVar);
    }

    private ezwn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0000\rင\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new ezwn();
        }
        if (ordinal == 4) {
            return new ezwm();
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
        synchronized (ezwn.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
