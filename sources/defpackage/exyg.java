package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exyg extends eyfy implements eyht {
    public static final exyg a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public boolean d;
    public eygi e = emptyIntList();

    static {
        exyg exygVar = new exyg();
        a = exygVar;
        eyfy.registerDefaultInstance(exyg.class, exygVar);
    }

    private exyg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0001\u0000\u0006ဇ\u0005\tဇ\b\u000bࠬ", new Object[]{"b", "c", "d", "e", exxd.a});
        }
        if (ordinal == 3) {
            return new exyg();
        }
        if (ordinal == 4) {
            return new exyf();
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
        synchronized (exyg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
