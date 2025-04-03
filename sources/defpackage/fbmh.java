package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmh extends eyfy implements eyht {
    public static final fbmh a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbmh fbmhVar = new fbmh();
        a = fbmhVar;
        eyfy.registerDefaultInstance(fbmh.class, fbmhVar);
    }

    private fbmh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000f<\u0000g<\u0000", new Object[]{"c", "b", "d", fbmp.class, fbmt.class, fblx.class});
        }
        if (ordinal == 3) {
            return new fbmh();
        }
        if (ordinal == 4) {
            return new fbmg();
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
        synchronized (fbmh.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
