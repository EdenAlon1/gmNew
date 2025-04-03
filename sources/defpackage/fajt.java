package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fajt extends eyfy implements eyht {
    public static final fajt a;
    private static volatile eyhz d;
    public eygi b = emptyIntList();
    public fahc c;
    private int e;

    static {
        fajt fajtVar = new fajt();
        a = fajtVar;
        eyfy.registerDefaultInstance(fajt.class, fajtVar);
    }

    private fajt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fajt();
        }
        if (ordinal == 4) {
            return new fajs();
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
        synchronized (fajt.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
