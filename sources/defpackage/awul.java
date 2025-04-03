package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awul extends eyfy implements eyht {
    public static final awul a;
    private static volatile eyhz e;
    public int b;
    public awup c;
    public eyee d = eyee.b;

    static {
        awul awulVar = new awul();
        a = awulVar;
        eyfy.registerDefaultInstance(awul.class, awulVar);
    }

    private awul() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new awul();
        }
        if (ordinal == 4) {
            return new awuk();
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
        synchronized (awul.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
