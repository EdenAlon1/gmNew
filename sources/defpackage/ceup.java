package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceup extends eyfy implements eyht {
    public static final ceup a;
    private static volatile eyhz g;
    public int b;
    public eyev e;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        ceup ceupVar = new ceup();
        a = ceupVar;
        eyfy.registerDefaultInstance(ceup.class, ceupVar);
    }

    private ceup() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new ceup();
        }
        if (ordinal == 4) {
            return new ceuo();
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
        synchronized (ceup.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
