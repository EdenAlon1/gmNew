package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzp extends eyfy implements eyht {
    public static final axzp a;
    private static volatile eyhz e;
    public eygl b = emptyLongList();
    public int c;
    public int d;

    static {
        axzp axzpVar = new axzp();
        a = axzpVar;
        eyfy.registerDefaultInstance(axzp.class, axzpVar);
    }

    private axzp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001%\u0002\u0004\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new axzp();
        }
        if (ordinal == 4) {
            return new axzo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (axzp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
