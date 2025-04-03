package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrc extends eyfy implements eyht {
    public static final eygj a = new eqra();
    public static final eqrc b;
    private static volatile eyhz f;
    public int c;
    public int d;
    public eygi e = emptyIntList();

    static {
        eqrc eqrcVar = new eqrc();
        b = eqrcVar;
        eyfy.registerDefaultInstance(eqrc.class, eqrcVar);
    }

    private eqrc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002᠌\u0000\u0003ࠬ", new Object[]{"c", "d", edeh.a, "e", edfa.a});
        }
        if (ordinal == 3) {
            return new eqrc();
        }
        if (ordinal == 4) {
            return new eqrb();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqrc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
