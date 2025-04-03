package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class escy extends eyfy implements eyht {
    public static final escy a;
    private static volatile eyhz g;
    public int b;
    public escr c;
    public escx d;
    public boolean e;
    public esbs f;

    static {
        escy escyVar = new escy();
        a = escyVar;
        eyfy.registerDefaultInstance(escy.class, escyVar);
    }

    private escy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဉ\u0001\u0005ဉ\u0000\u0006\u0007\u0007ဉ\u0002", new Object[]{"b", "d", "c", "e", "f"});
        }
        if (ordinal == 3) {
            return new escy();
        }
        if (ordinal == 4) {
            return new escv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (escy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
