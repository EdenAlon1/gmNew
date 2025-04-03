package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbln extends eyfy implements eyht {
    public static final fbln a;
    private static volatile eyhz c;
    public fbip b;
    private int d;

    static {
        fbln fblnVar = new fbln();
        a = fblnVar;
        eyfy.registerDefaultInstance(fbln.class, fblnVar);
    }

    private fbln() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new fbln();
        }
        if (ordinal == 4) {
            return new fblm();
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
        synchronized (fbln.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
