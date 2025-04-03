package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbfp extends eyfy implements eyht {
    public static final fbfp a;
    private static volatile eyhz f;
    public int b;
    public fcfo c;
    public int d;
    public String e = "";

    static {
        fbfp fbfpVar = new fbfp();
        a = fbfpVar;
        eyfy.registerDefaultInstance(fbfp.class, fbfpVar);
    }

    private fbfp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0004\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbfp();
        }
        if (ordinal == 4) {
            return new fbfo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbfp.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
