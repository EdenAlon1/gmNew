package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaur extends eyfy implements eyht {
    public static final eaur a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eaur eaurVar = new eaur();
        a = eaurVar;
        eyfy.registerDefaultInstance(eaur.class, eaurVar);
    }

    private eaur() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", eaum.class, eauq.class, eauo.class, eaui.class, eauk.class});
        }
        if (ordinal == 3) {
            return new eaur();
        }
        if (ordinal == 4) {
            return new eaug();
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
        synchronized (eaur.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
