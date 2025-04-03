package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpj extends eyfy implements eyht {
    public static final fbpj a;
    private static volatile eyhz c;
    public fcek b;
    private int d;

    static {
        fbpj fbpjVar = new fbpj();
        a = fbpjVar;
        eyfy.registerDefaultInstance(fbpj.class, fbpjVar);
    }

    private fbpj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new fbpj();
        }
        if (ordinal == 4) {
            return new fbpi();
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
        synchronized (fbpj.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
