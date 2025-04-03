package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvl extends eyfy implements eyht {
    public static final fbvl a;
    private static volatile eyhz g;
    public int b;
    public fauu d;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        fbvl fbvlVar = new fbvl();
        a = fbvlVar;
        eyfy.registerDefaultInstance(fbvl.class, fbvlVar);
    }

    private fbvl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fbvl();
        }
        if (ordinal == 4) {
            return new fbvk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbvl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
