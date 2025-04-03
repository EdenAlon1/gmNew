package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capv extends eyfy implements eyht {
    public static final eygj a = new capr();
    public static final capv b;
    private static volatile eyhz f;
    public int c;
    public awui d;
    public eygi e = emptyIntList();

    static {
        capv capvVar = new capv();
        b = capvVar;
        eyfy.registerDefaultInstance(capv.class, capvVar);
    }

    private capv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002ࠬ", new Object[]{"c", "d", "e", capt.a});
        }
        if (ordinal == 3) {
            return new capv();
        }
        if (ordinal == 4) {
            return new caps();
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
        synchronized (capv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
