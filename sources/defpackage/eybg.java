package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eybg extends eyfy implements eyht {
    public static final eygj a = new eybe();
    public static final eybg b;
    private static volatile eyhz d;
    public eygi c = emptyIntList();

    static {
        eybg eybgVar = new eybg();
        b = eybgVar;
        eyfy.registerDefaultInstance(eybg.class, eybgVar);
    }

    private eybg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", eybr.a});
        }
        if (ordinal == 3) {
            return new eybg();
        }
        if (ordinal == 4) {
            return new eybf();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eybg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
