package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopt extends eyfy implements eyht {
    public static final eopt a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public long d;
    public eoit e;
    public eoty f;
    public eoit g;

    static {
        eopt eoptVar = new eopt();
        a = eoptVar;
        eyfy.registerDefaultInstance(eopt.class, eoptVar);
    }

    private eopt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", eops.a, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eopt();
        }
        if (ordinal == 4) {
            return new eopr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eopt.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
