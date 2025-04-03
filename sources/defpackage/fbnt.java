package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnt extends eyfy implements eyht {
    public static final fbnt a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbnt fbntVar = new fbnt();
        a = fbntVar;
        eyfy.registerDefaultInstance(fbnt.class, fbntVar);
    }

    private fbnt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\f\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005:\u0000\u0006:\u0000\u0007:\u0000\b<\u0000\t<\u0000\n7\u0000\u000b<\u0000\f?\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", "d", faul.class, faul.class, fbnv.class, fbnj.class, faul.class});
        }
        if (ordinal == 3) {
            return new fbnt();
        }
        if (ordinal == 4) {
            return new fbns();
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
        synchronized (fbnt.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
