package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpx extends eyfy implements eyht {
    public static final fgpx a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public eygi e = emptyIntList();
    public eygi f = emptyIntList();

    static {
        fgpx fgpxVar = new fgpx();
        a = fgpxVar;
        eyfy.registerDefaultInstance(fgpx.class, fgpxVar);
    }

    private fgpx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fgpx();
        }
        if (ordinal == 4) {
            return new fgpw();
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
        synchronized (fgpx.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
