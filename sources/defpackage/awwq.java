package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwq extends eyfy implements eyht {
    public static final awwq a;
    private static volatile eyhz f;
    public int b;
    public awui c;
    public int d;
    public awxf e;

    static {
        awwq awwqVar = new awwq();
        a = awwqVar;
        eyfy.registerDefaultInstance(awwq.class, awwqVar);
    }

    private awwq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", awwo.a, "e"});
        }
        if (ordinal == 3) {
            return new awwq();
        }
        if (ordinal == 4) {
            return new awwn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awwq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
