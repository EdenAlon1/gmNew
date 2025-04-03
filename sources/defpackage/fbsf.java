package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbsf extends eyfy implements eyht {
    public static final fbsf a;
    private static volatile eyhz b;

    static {
        fbsf fbsfVar = new fbsf();
        a = fbsfVar;
        eyfy.registerDefaultInstance(fbsf.class, fbsfVar);
    }

    private fbsf() {
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
            return new fbsf();
        }
        if (ordinal == 4) {
            return new fbse();
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
        synchronized (fbsf.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
