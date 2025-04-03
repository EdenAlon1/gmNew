package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgox extends eyfy implements eyht {
    public static final fgox a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public eyev f;

    static {
        fgox fgoxVar = new fgox();
        a = fgoxVar;
        eyfy.registerDefaultInstance(fgox.class, fgoxVar);
    }

    private fgox() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"d", "c", "b", "e", "f", fgos.class, fgou.class, fgop.class});
        }
        if (ordinal == 3) {
            return new fgox();
        }
        if (ordinal == 4) {
            return new fgon();
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
        synchronized (fgox.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
