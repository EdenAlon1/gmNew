package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblx extends eyfy implements eyht {
    public static final cblx a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        cblx cblxVar = new cblx();
        a = cblxVar;
        eyfy.registerDefaultInstance(cblx.class, cblxVar);
    }

    private cblx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cblx();
        }
        if (ordinal == 4) {
            return new cblw();
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
        synchronized (cblx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
