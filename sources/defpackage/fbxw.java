package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxw extends eyfy implements eyht {
    public static final fbxw a;
    private static volatile eyhz c;
    public String b = "";

    static {
        fbxw fbxwVar = new fbxw();
        a = fbxwVar;
        eyfy.registerDefaultInstance(fbxw.class, fbxwVar);
    }

    private fbxw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbxw();
        }
        if (ordinal == 4) {
            return new fbxv();
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
        synchronized (fbxw.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
