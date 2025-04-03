package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxm extends eyfy implements eyht {
    public static final fbxm a;
    private static volatile eyhz h;
    public int b;
    public int c = 0;
    public Object d;
    public fbxq e;
    public fbxq f;
    public float g;

    static {
        fbxm fbxmVar = new fbxm();
        a = fbxmVar;
        eyfy.registerDefaultInstance(fbxm.class, fbxmVar);
    }

    private fbxm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u0001", new Object[]{"d", "c", "b", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fbxm();
        }
        if (ordinal == 4) {
            return new fbxl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbxm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
