package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbdf extends eyfy implements eyht {
    public static final fbdf a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        fbdf fbdfVar = new fbdf();
        a = fbdfVar;
        eyfy.registerDefaultInstance(fbdf.class, fbdfVar);
    }

    private fbdf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", fbdx.class, fbdt.class});
        }
        if (ordinal == 3) {
            return new fbdf();
        }
        if (ordinal == 4) {
            return new fbde();
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
        synchronized (fbdf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
