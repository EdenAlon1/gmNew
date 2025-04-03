package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohv extends eyfy implements eyht {
    public static final eygj a = new eohn();
    public static final eohv b;
    private static volatile eyhz l;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public eygi j = emptyIntList();
    public boolean k;

    static {
        eohv eohvVar = new eohv();
        b = eohvVar;
        eyfy.registerDefaultInstance(eohv.class, eohvVar);
    }

    private eohv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ࠬ\bဇ\u0006", new Object[]{"c", "d", eohs.a, "e", eoho.a, "f", "g", epli.a, "h", "i", "j", eohq.a, "k"});
        }
        if (ordinal == 3) {
            return new eohv();
        }
        if (ordinal == 4) {
            return new eohu();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = l;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eohv.class) {
            eyhzVar = l;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                l = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
