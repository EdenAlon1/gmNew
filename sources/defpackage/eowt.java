package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowt extends eyfy implements eyht {
    public static final eowt a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public String e = "";

    static {
        eowt eowtVar = new eowt();
        a = eowtVar;
        eyfy.registerDefaultInstance(eowt.class, eowtVar);
    }

    private eowt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", eows.a, "e"});
        }
        if (ordinal == 3) {
            return new eowt();
        }
        if (ordinal == 4) {
            return new eowr();
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
        synchronized (eowt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
