package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbjq extends eyfy implements eyht {
    public static final fbjq a;
    private static volatile eyhz d;
    public int b;
    public ertf c;
    private emco e;

    static {
        fbjq fbjqVar = new fbjq();
        a = fbjqVar;
        eyfy.registerDefaultInstance(fbjq.class, fbjqVar);
    }

    private fbjq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "e", "c"});
        }
        if (ordinal == 3) {
            return new fbjq();
        }
        if (ordinal == 4) {
            return new fbjp();
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
        synchronized (fbjq.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
