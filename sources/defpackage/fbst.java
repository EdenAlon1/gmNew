package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbst extends eyfy implements eyht {
    public static final fbst a;
    private static volatile eyhz c;
    public int b;

    static {
        fbst fbstVar = new fbst();
        a = fbstVar;
        eyfy.registerDefaultInstance(fbst.class, fbstVar);
    }

    private fbst() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbst();
        }
        if (ordinal == 4) {
            return new fbss();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbst.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
