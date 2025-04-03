package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeul extends eyfy implements eyht {
    public static final aeul a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        aeul aeulVar = new aeul();
        a = aeulVar;
        eyfy.registerDefaultInstance(aeul.class, aeulVar);
    }

    private aeul() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = aeuj.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", eyggVar, "e", eyggVar});
        }
        if (ordinal == 3) {
            return new aeul();
        }
        if (ordinal == 4) {
            return new aeui();
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
        synchronized (aeul.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
