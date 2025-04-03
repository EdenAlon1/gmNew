package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhy extends eyfy implements eyht {
    public static final fbhy a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbhy fbhyVar = new fbhy();
        a = fbhyVar;
        eyfy.registerDefaultInstance(fbhy.class, fbhyVar);
    }

    private fbhy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001g\u0004\u0000\u0000\u0000\u0001\fe<\u0000fȻ\u0000g<\u0000", new Object[]{"c", "b", "d", fbiw.class, fbhs.class});
        }
        if (ordinal == 3) {
            return new fbhy();
        }
        if (ordinal == 4) {
            return new fbhx();
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
        synchronized (fbhy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
