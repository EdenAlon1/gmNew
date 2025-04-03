package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbew extends eyfy implements eyht {
    public static final fbew a;
    private static volatile eyhz d;
    public boolean b;
    public String c = "";

    static {
        fbew fbewVar = new fbew();
        a = fbewVar;
        eyfy.registerDefaultInstance(fbew.class, fbewVar);
    }

    private fbew() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u0007\u0004Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbew();
        }
        if (ordinal == 4) {
            return new fbev();
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
        synchronized (fbew.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
