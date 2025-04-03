package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctsu extends eyfy implements eyht {
    public static final ctsu a;
    private static volatile eyhz f;
    public String b = "";
    public String c = "";
    public int d;
    public boolean e;

    static {
        ctsu ctsuVar = new ctsu();
        a = ctsuVar;
        eyfy.registerDefaultInstance(ctsu.class, ctsuVar);
    }

    private ctsu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ctsu();
        }
        if (ordinal == 4) {
            return new ctst();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ctsu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
