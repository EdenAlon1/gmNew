package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbko extends eyfy implements eyht {
    public static final fbko a;
    private static volatile eyhz k;
    public int b;
    public fbik c;
    public eyhm d = eyhm.a;
    public fbic e;
    public eyhm f;
    public String g;
    public eyhm h;
    public long i;
    public eyee j;
    private fbip l;
    private fblh m;
    private eyhm n;

    static {
        fbko fbkoVar = new fbko();
        a = fbkoVar;
        eyfy.registerDefaultInstance(fbko.class, fbkoVar);
    }

    private fbko() {
        eyhm eyhmVar = eyhm.a;
        this.n = eyhmVar;
        this.f = eyhmVar;
        this.h = eyhmVar;
        this.g = "";
        this.j = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0004\u0000\u0000\u0001ဉ\u0000\u00022\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u00062\u00072\bȈ\t2\n\u0002\u000b\n", new Object[]{"b", "c", "d", fbkl.a, "e", "l", "m", "n", fbkk.a, "f", fbkm.a, "g", "h", fbkn.a, "i", "j"});
        }
        if (ordinal == 3) {
            return new fbko();
        }
        if (ordinal == 4) {
            return new fbkj();
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
        synchronized (fbko.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
