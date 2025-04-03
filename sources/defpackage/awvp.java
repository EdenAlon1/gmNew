package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvp extends eyfy implements eyht {
    public static final awvp a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public int d;

    static {
        awvp awvpVar = new awvp();
        a = awvpVar;
        eyfy.registerDefaultInstance(awvp.class, awvpVar);
    }

    private awvp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ayhc.a});
        }
        if (ordinal == 3) {
            return new awvp();
        }
        if (ordinal == 4) {
            return new awvo();
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
        synchronized (awvp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
