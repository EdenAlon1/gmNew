package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejk extends eyfy implements eyht {
    public static final eygj a = new ceji();
    public static final cejk b;
    private static volatile eyhz m;
    public int c;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public eyja i;
    public eyja j;
    public boolean l;
    public String f = "";
    public eygi k = emptyIntList();

    static {
        cejk cejkVar = new cejk();
        b = cejkVar;
        eyfy.registerDefaultInstance(cejk.class, cejkVar);
    }

    private cejk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = cejn.a;
            return newMessageInfo(b, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0007ဉ\u0005\bဉ\u0006\tࠬ\nဇ\u0007", new Object[]{"c", "d", "e", eyggVar, "f", "g", "h", "i", "j", "k", eyggVar, "l"});
        }
        if (ordinal == 3) {
            return new cejk();
        }
        if (ordinal == 4) {
            return new cejj();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = m;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cejk.class) {
            eyhzVar = m;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                m = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
