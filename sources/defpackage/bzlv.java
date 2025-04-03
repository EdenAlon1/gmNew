package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzlv extends eyfy implements eyht {
    public static final bzlv a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        bzlv bzlvVar = new bzlv();
        a = bzlvVar;
        eyfy.registerDefaultInstance(bzlv.class, bzlvVar);
    }

    private bzlv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new bzlv();
        }
        if (ordinal == 4) {
            return new bzlu();
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
        synchronized (bzlv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
