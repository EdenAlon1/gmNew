package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyox extends eyfy implements eyht {
    public static final eyox a;
    private static volatile eyhz d;
    public long b;
    public long c;
    private int e;

    static {
        eyox eyoxVar = new eyox();
        a = eyoxVar;
        eyfy.registerDefaultInstance(eyox.class, eyoxVar);
    }

    private eyox() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new eyox();
        }
        if (ordinal == 4) {
            return new eyow();
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
        synchronized (eyox.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
