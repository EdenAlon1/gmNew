package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbes extends eyfy implements eyht {
    public static final fbes a;
    private static volatile eyhz j;
    public String b;
    public fbik c;
    public eygl d;
    public eyhm e = eyhm.a;
    public eyhm f;
    public long g;
    public eyhm h;
    public eyee i;
    private int k;

    static {
        fbes fbesVar = new fbes();
        a = fbesVar;
        eyfy.registerDefaultInstance(fbes.class, fbesVar);
    }

    private fbes() {
        eyhm eyhmVar = eyhm.a;
        this.f = eyhmVar;
        this.h = eyhmVar;
        emptyProtobufList();
        this.b = "";
        this.d = emptyLongList();
        this.i = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\r\u0016\b\u0003\u0001\u0000\rȈ\u000eဉ\u0002\u000f%\u00102\u00132\u0014\u0002\u00152\u0016\n", new Object[]{"k", "b", "c", "d", "e", fber.a, "f", fbeq.a, "g", "h", fbep.a, "i"});
        }
        if (ordinal == 3) {
            return new fbes();
        }
        if (ordinal == 4) {
            return new fbeo();
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
        synchronized (fbes.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
