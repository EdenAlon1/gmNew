package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyev extends eyfy implements eyht {
    public static final eyev a;
    private static volatile eyhz d;
    public long b;
    public int c;

    static {
        eyev eyevVar = new eyev();
        a = eyevVar;
        eyfy.registerDefaultInstance(eyev.class, eyevVar);
    }

    private eyev() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eyev();
        }
        if (ordinal == 4) {
            return new eyeu();
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
        synchronized (eyev.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
