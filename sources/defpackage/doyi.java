package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyi extends eyfy implements eyht {
    public static final doyi a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public long g;
    public eyja i;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        doyi doyiVar = new doyi();
        a = doyiVar;
        eyfy.registerDefaultInstance(doyi.class, doyiVar);
    }

    private doyi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001È\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ለ\u0003\u0005ဉ\u0004È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", doyh.class});
        }
        if (ordinal == 3) {
            return new doyi();
        }
        if (ordinal == 4) {
            return new doye();
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
        synchronized (doyi.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
