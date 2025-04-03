package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkq extends eyfy implements eyht {
    public static final axkq a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        axkq axkqVar = new axkq();
        a = axkqVar;
        eyfy.registerDefaultInstance(axkq.class, axkqVar);
    }

    private axkq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = axko.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eyggVar});
        }
        if (ordinal == 3) {
            return new axkq();
        }
        if (ordinal == 4) {
            return new axkn();
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
        synchronized (axkq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
