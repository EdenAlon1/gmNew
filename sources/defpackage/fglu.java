package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglu extends eyfy implements eyht {
    public static final fglu a;
    public static final eyfw b;
    private static volatile eyhz k;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public fglz g;
    public int h;
    public String i = "";
    public eygr j = emptyProtobufList();

    static {
        fglu fgluVar = new fglu();
        a = fgluVar;
        eyfy.registerDefaultInstance(fglu.class, fgluVar);
        b = eyfy.newSingularGeneratedExtension(fgmh.a, fgluVar, fgluVar, null, 11, eyjr.MESSAGE, fglu.class);
    }

    private fglu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0004\n\u0007\u0000\u0001\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0006\u0007ဇ\u0005\b᠌\u0007\tဈ\b\n\u001b", new Object[]{"c", "d", "e", "g", "f", "h", fgls.a, "i", "j", fgmc.class});
        }
        if (ordinal == 3) {
            return new fglu();
        }
        if (ordinal == 4) {
            return new fglr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fglu.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
