package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxhw extends eyfy implements eyht {
    public static final cxhw a;
    private static volatile eyhz e;
    public int b;
    public int c = 1;
    public int d = 1;

    static {
        cxhw cxhwVar = new cxhw();
        a = cxhwVar;
        eyfy.registerDefaultInstance(cxhw.class, cxhwVar);
    }

    private cxhw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = cxhu.a;
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", eyggVar, "d", eyggVar});
        }
        if (ordinal == 3) {
            return new cxhw();
        }
        if (ordinal == 4) {
            return new cxht();
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
        synchronized (cxhw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
