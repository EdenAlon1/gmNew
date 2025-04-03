package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eukn extends eyfy implements eyht {
    public static final eukn a;
    private static volatile eyhz c;
    public long b = -1;
    private int d;

    static {
        eukn euknVar = new eukn();
        a = euknVar;
        eyfy.registerDefaultInstance(eukn.class, euknVar);
    }

    private eukn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new eukn();
        }
        if (ordinal == 4) {
            return new eukm();
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
        synchronized (eukn.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
