package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoiq extends eyfy implements eyht {
    public static final eoiq a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public eygi f = emptyIntList();
    public int g;

    static {
        eoiq eoiqVar = new eoiq();
        a = eoiqVar;
        eyfy.registerDefaultInstance(eoiq.class, eoiqVar);
    }

    private eoiq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003", new Object[]{"b", "c", eoin.a, "d", eoii.a, "e", eoij.a, "f", eoig.a, "g", eoil.a});
        }
        if (ordinal == 3) {
            return new eoiq();
        }
        if (ordinal == 4) {
            return new eoip();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoiq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
