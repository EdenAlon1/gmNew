package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcjy extends eyfy implements eyht {
    public static final fcjy a;
    private static volatile eyhz h;
    public Object c;
    public int d;
    public int e;
    public int b = 0;
    public String f = "";
    public String g = "";

    static {
        fcjy fcjyVar = new fcjy();
        a = fcjyVar;
        eyfy.registerDefaultInstance(fcjy.class, fcjyVar);
    }

    private fcjy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0007<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", fcjx.class});
        }
        if (ordinal == 3) {
            return new fcjy();
        }
        if (ordinal == 4) {
            return new fcjv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcjy.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
