package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbyk extends eyfy implements eyht {
    public static final fbyk a;
    private static volatile eyhz b;

    static {
        fbyk fbykVar = new fbyk();
        a = fbykVar;
        eyfy.registerDefaultInstance(fbyk.class, fbykVar);
    }

    private fbyk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fbyk();
        }
        if (ordinal == 4) {
            return new fbyj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbyk.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
