package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmj extends eyfy implements eyht {
    public static final fbmj a;
    private static volatile eyhz g;
    public int b;
    public fbku c;
    public int d;
    public int e;
    public String f = "";

    static {
        fbmj fbmjVar = new fbmj();
        a = fbmjVar;
        eyfy.registerDefaultInstance(fbmj.class, fbmjVar);
    }

    private fbmj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fbmj();
        }
        if (ordinal == 4) {
            return new fbmi();
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
        synchronized (fbmj.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
