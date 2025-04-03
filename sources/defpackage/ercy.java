package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercy extends eyfy implements eyht {
    public static final ercy a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        ercy ercyVar = new ercy();
        a = ercyVar;
        eyfy.registerDefaultInstance(ercy.class, ercyVar);
    }

    private ercy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0003\u0006ဇ\u0005", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ercy();
        }
        if (ordinal == 4) {
            return new ercx();
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
        synchronized (ercy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
