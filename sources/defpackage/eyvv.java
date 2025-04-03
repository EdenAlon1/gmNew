package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvv extends eyfy implements eyht {
    public static final eyvv a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public int f;
    public int g;

    static {
        eyvv eyvvVar = new eyvv();
        a = eyvvVar;
        eyfy.registerDefaultInstance(eyvv.class, eyvvVar);
    }

    private eyvv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0002\u0003<\u0000\u0004᠌\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", "e", "g", eytx.a, eywr.class, "f", eyty.a, eyuu.class, eywh.class, eyvd.class, eyvt.class, eyuw.class, eyuz.class, eyuj.class, eyvq.class, eyvj.class});
        }
        if (ordinal == 3) {
            return new eyvv();
        }
        if (ordinal == 4) {
            return new eyvu();
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
        synchronized (eyvv.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
