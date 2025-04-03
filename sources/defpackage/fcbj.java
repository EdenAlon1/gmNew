package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbj extends eyfy implements eyht {
    public static final fcbj a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public fcbc d;
    private int f;

    static {
        fcbj fcbjVar = new fcbj();
        a = fcbjVar;
        eyfy.registerDefaultInstance(fcbj.class, fcbjVar);
    }

    private fcbj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "f", "d", fbzt.class, fcbe.class, fcbi.class, fcax.class, fcbg.class, fcaz.class});
        }
        if (ordinal == 3) {
            return new fcbj();
        }
        if (ordinal == 4) {
            return new fcav();
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
        synchronized (fcbj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
