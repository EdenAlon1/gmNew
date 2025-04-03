package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erii extends eyfy implements eyht {
    public static final erii a;
    private static volatile eyhz z;
    public int b;
    public int c;
    public int d;
    public erie e;
    public long f;
    public erjw g;
    public eriu h;
    public erig i;
    public erjm j;
    public eris k;
    public erjg l;
    public eric m;
    public erjc n;
    public eriq o;
    public erji p;
    public erja q;
    public erik r;
    public erio s;
    public eriw t;
    public eriy u;
    public erju v;
    public erjk w;
    public erjo x;
    public erim y;

    static {
        erii eriiVar = new erii();
        a = eriiVar;
        eyfy.registerDefaultInstance(erii.class, eriiVar);
    }

    private erii() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0015\u0000\u0003\nQ\u0015\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001f(ဉ'.ဉ-0ဉ/1ဉ03ဉ36ဉ6?ဉ?@ဉ@AဉABဉBCဉCEဉEGဉHHဉ\u0014KဉIMဉKPဉNQဉO", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "g", "v", "w", "x", "y"});
        }
        if (ordinal == 3) {
            return new erii();
        }
        if (ordinal == 4) {
            return new erih();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = z;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erii.class) {
            eyhzVar = z;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                z = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
