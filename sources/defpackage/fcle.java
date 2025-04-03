package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcle extends eyfy implements eyht {
    public static final fcle a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public eyee e = eyee.b;
    public fcev f;
    public fcev g;

    static {
        fcle fcleVar = new fcle();
        a = fcleVar;
        eyfy.registerDefaultInstance(fcle.class, fcleVar);
    }

    private fcle() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fcle();
        }
        if (ordinal == 4) {
            return new fcld();
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
        synchronized (fcle.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
