package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exza extends eyfy implements eyht {
    public static final eygj a = new exyy();
    public static final exza b;
    private static volatile eyhz g;
    public int c;
    public fava d;
    public fava e;
    public eygi f = emptyIntList();

    static {
        exza exzaVar = new exza();
        b = exzaVar;
        eyfy.registerDefaultInstance(exza.class, exzaVar);
    }

    private exza() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ࠬ", new Object[]{"c", "d", "e", "f", faur.a});
        }
        if (ordinal == 3) {
            return new exza();
        }
        if (ordinal == 4) {
            return new exyz();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exza.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
