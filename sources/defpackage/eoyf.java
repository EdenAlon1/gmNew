package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoyf extends eyfy implements eyht {
    public static final eoyf a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eoyf eoyfVar = new eoyf();
        a = eoyfVar;
        eyfy.registerDefaultInstance(eoyf.class, eoyfVar);
    }

    private eoyf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", eoyd.class, eoxw.class, eoxu.class, eoxs.class, eoxz.class});
        }
        if (ordinal == 3) {
            return new eoyf();
        }
        if (ordinal == 4) {
            return new eoxp();
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
        synchronized (eoyf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
