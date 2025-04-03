package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtet extends eyfy implements eyht {
    public static final dtet a;
    private static volatile eyhz d;
    public dtez b;
    public int c;
    private int e;

    static {
        dtet dtetVar = new dtet();
        a = dtetVar;
        eyfy.registerDefaultInstance(dtet.class, dtetVar);
    }

    private dtet() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new dtet();
        }
        if (ordinal == 4) {
            return new dtes();
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
        synchronized (dtet.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
