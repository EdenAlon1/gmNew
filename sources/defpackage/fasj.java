package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fasj extends eyfy implements eyht {
    public static final fasj a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        fasj fasjVar = new fasj();
        a = fasjVar;
        eyfy.registerDefaultInstance(fasj.class, fasjVar);
    }

    private fasj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", farx.class, fasf.class, fash.class, fasn.class, fasb.class, fasd.class});
        }
        if (ordinal == 3) {
            return new fasj();
        }
        if (ordinal == 4) {
            return new fasi();
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
        synchronized (fasj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
