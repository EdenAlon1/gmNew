package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbok extends eyfy implements eyht {
    public static final fbok a;
    private static volatile eyhz c;
    public fbnz b;
    private int d;

    static {
        fbok fbokVar = new fbok();
        a = fbokVar;
        eyfy.registerDefaultInstance(fbok.class, fbokVar);
    }

    private fbok() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new fbok();
        }
        if (ordinal == 4) {
            return new fboj();
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
        synchronized (fbok.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
