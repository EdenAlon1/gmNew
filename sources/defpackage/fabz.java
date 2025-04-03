package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fabz extends eyfy implements eyht {
    public static final eygj a = new fabx();
    public static final fabz b;
    private static volatile eyhz g;
    public String c = "";
    public String d = "";
    public eygi e = emptyIntList();
    public String f = "";
    private int h;

    static {
        fabz fabzVar = new fabz();
        b = fabzVar;
        eyfy.registerDefaultInstance(fabz.class, fabzVar);
    }

    private fabz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ࠞ\u0004ဈ\u0003", new Object[]{"h", "c", "d", "e", fabv.a, "f"});
        }
        if (ordinal == 3) {
            return new fabz();
        }
        if (ordinal == 4) {
            return new faby();
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
        synchronized (fabz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
