package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxq extends eyfy implements eyht {
    public static final fbxq a;
    private static volatile eyhz e;
    public int b;
    public fauq c;
    public int d;

    static {
        fbxq fbxqVar = new fbxq();
        a = fbxqVar;
        eyfy.registerDefaultInstance(fbxq.class, fbxqVar);
    }

    private fbxq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fbxq();
        }
        if (ordinal == 4) {
            return new fbxp();
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
        synchronized (fbxq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
