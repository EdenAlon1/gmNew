package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akcv extends eyfy implements eyht {
    public static final akcv a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public eyee e = eyee.b;

    static {
        akcv akcvVar = new akcv();
        a = akcvVar;
        eyfy.registerDefaultInstance(akcv.class, akcvVar);
    }

    private akcv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဂ\u0001\u0007<\u0000", new Object[]{"d", "c", "b", "e", akcl.class, akcu.class, akcq.class, akcn.class, "f", akcs.class});
        }
        if (ordinal == 3) {
            return new akcv();
        }
        if (ordinal == 4) {
            return new akcj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (akcv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
