package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fceo extends eyfy implements eyht {
    public static final fceo a;
    private static volatile eyhz e;
    public String b = "";
    public int c;
    public eyga d;
    private int f;

    static {
        fceo fceoVar = new fceo();
        a = fceoVar;
        eyfy.registerDefaultInstance(fceo.class, fceoVar);
    }

    private fceo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fceo();
        }
        if (ordinal == 4) {
            return new fcen();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fceo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
