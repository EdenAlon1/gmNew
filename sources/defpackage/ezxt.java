package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezxt extends eyfy implements eyht {
    public static final ezxt a;
    private static volatile eyhz g;
    public int b;
    public eyja c;
    public eyev d;
    public fabj e;
    public ezxr f;

    static {
        ezxt ezxtVar = new ezxt();
        a = ezxtVar;
        eyfy.registerDefaultInstance(ezxt.class, ezxtVar);
    }

    private ezxt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ezxt();
        }
        if (ordinal == 4) {
            return new ezxs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezxt.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
