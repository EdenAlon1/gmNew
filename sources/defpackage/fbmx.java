package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmx extends eyfy implements eyht {
    public static final fbmx a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbmx fbmxVar = new fbmx();
        a = fbmxVar;
        eyfy.registerDefaultInstance(fbmx.class, fbmxVar);
    }

    private fbmx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001f\u0003\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000", new Object[]{"c", "b", "d", fbmr.class, fbmz.class});
        }
        if (ordinal == 3) {
            return new fbmx();
        }
        if (ordinal == 4) {
            return new fbmw();
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
        synchronized (fbmx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
