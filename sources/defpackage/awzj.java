package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awzj extends eyfy implements eyht {
    public static final awzj a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public axad g;
    public awui h;
    public awui i;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        awzj awzjVar = new awzj();
        a = awzjVar;
        eyfy.registerDefaultInstance(awzj.class, awzjVar);
    }

    private awzj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဈ\u0001\tဉ\u0002\n<\u0000\u000bဉ\u0003\fဉ\u0004\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", "e", awyx.class, awzh.class, awzf.class, awzo.class, axab.class, awzz.class, "f", "g", awzx.class, "h", "i", awzs.class, awzq.class, awzv.class});
        }
        if (ordinal == 3) {
            return new awzj();
        }
        if (ordinal == 4) {
            return new awzi();
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
        synchronized (awzj.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
