package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdx extends eyfy implements eyht {
    public static final sdx a;
    private static volatile eyhz d;
    public String b = "";
    public String c = "";

    static {
        sdx sdxVar = new sdx();
        a = sdxVar;
        eyfy.registerDefaultInstance(sdx.class, sdxVar);
    }

    private sdx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0006\u0002\u0000\u0000\u0000\u0001Ȉ\u0006Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new sdx();
        }
        if (ordinal == 4) {
            return new sdw();
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
        synchronized (sdx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
