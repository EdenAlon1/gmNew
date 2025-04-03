package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwj extends eyfy implements eyht {
    public static final fbwj a;
    private static volatile eyhz d;
    public String b = "";
    public int c;

    static {
        fbwj fbwjVar = new fbwj();
        a = fbwjVar;
        eyfy.registerDefaultInstance(fbwj.class, fbwjVar);
    }

    private fbwj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbwj();
        }
        if (ordinal == 4) {
            return new fbwi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbwj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
