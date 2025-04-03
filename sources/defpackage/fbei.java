package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class fbei extends eyfy implements eyht {
    public static final fbei a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        fbei fbeiVar = new fbei();
        a = fbeiVar;
        eyfy.registerDefaultInstance(fbei.class, fbeiVar);
    }

    private fbei() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbei();
        }
        if (ordinal == 4) {
            return new fbeh();
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
        synchronized (fbei.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
