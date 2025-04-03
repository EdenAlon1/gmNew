package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxi extends eyfy implements eyht {
    public static final fbxi a;
    private static volatile eyhz b;

    static {
        fbxi fbxiVar = new fbxi();
        a = fbxiVar;
        eyfy.registerDefaultInstance(fbxi.class, fbxiVar);
    }

    private fbxi() {
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
            return new fbxi();
        }
        if (ordinal == 4) {
            return new fbxh();
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
        synchronized (fbxi.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
