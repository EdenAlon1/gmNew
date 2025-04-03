package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezyx extends eyfy implements eyht {
    public static final ezyx a;
    private static volatile eyhz f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;

    static {
        ezyx ezyxVar = new ezyx();
        a = ezyxVar;
        eyfy.registerDefaultInstance(ezyx.class, ezyxVar);
    }

    private ezyx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0002\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0001\u0005<\u0001", new Object[]{"c", "b", "e", "d", faaz.class, faav.class, fabb.class, faax.class});
        }
        if (ordinal == 3) {
            return new ezyx();
        }
        if (ordinal == 4) {
            return new ezyw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezyx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
