package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpo extends eyfy implements eyht {
    public static final fbpo a;
    private static volatile eyhz d;
    public String b = "";
    public int c;

    static {
        fbpo fbpoVar = new fbpo();
        a = fbpoVar;
        eyfy.registerDefaultInstance(fbpo.class, fbpoVar);
    }

    private fbpo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fbpo();
        }
        if (ordinal == 4) {
            return new fbpm();
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
        synchronized (fbpo.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
