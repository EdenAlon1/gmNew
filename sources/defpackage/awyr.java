package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyr extends eyfy implements eyht {
    public static final awyr a;
    private static volatile eyhz h;
    public int b;
    public awui c;
    public String d = "";
    public String e = "";
    public eyee f = eyee.b;
    public awui g;

    static {
        awyr awyrVar = new awyr();
        a = awyrVar;
        eyfy.registerDefaultInstance(awyr.class, awyrVar);
    }

    private awyr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new awyr();
        }
        if (ordinal == 4) {
            return new awyq();
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
        synchronized (awyr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
