package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmd extends eyfy implements eyht {
    public static final fbmd a;
    private static volatile eyhz g;
    public int b;
    public fbks c;
    public int d;
    public int e;
    public String f = "";

    static {
        fbmd fbmdVar = new fbmd();
        a = fbmdVar;
        eyfy.registerDefaultInstance(fbmd.class, fbmdVar);
    }

    private fbmd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003\u0004\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "d", "e", "f", "c"});
        }
        if (ordinal == 3) {
            return new fbmd();
        }
        if (ordinal == 4) {
            return new fbmc();
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
        synchronized (fbmd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
