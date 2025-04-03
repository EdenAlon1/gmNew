package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgki extends eyfy implements eyht {
    public static final fgki a;
    private static volatile eyhz j;
    public int b;
    public fjay c;
    public fgkc d;
    public int e;
    public int f;
    public int g;
    public eyja h;
    public fgkf i;

    static {
        fgki fgkiVar = new fgki();
        a = fgkiVar;
        eyfy.registerDefaultInstance(fgki.class, fgkiVar);
    }

    private fgki() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\f\u0007ဉ\u0002\nဉ\u0005\u000b\f", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g"});
        }
        if (ordinal == 3) {
            return new fgki();
        }
        if (ordinal == 4) {
            return new fgkd();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgki.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
