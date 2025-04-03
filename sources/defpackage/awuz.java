package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awuz extends eyfy implements eyht {
    public static final awuz a;
    private static volatile eyhz g;
    public int b;
    public awud c;
    public awui d;
    public eyee e = eyee.b;
    public int f;

    static {
        awuz awuzVar = new awuz();
        a = awuzVar;
        eyfy.registerDefaultInstance(awuz.class, awuzVar);
    }

    private awuz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", eqyk.a});
        }
        if (ordinal == 3) {
            return new awuz();
        }
        if (ordinal == 4) {
            return new awuy();
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
        synchronized (awuz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
