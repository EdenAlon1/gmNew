package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fahq extends eyfy implements eyht {
    public static final eygj a = new fahn();
    public static final fahq b;
    private static volatile eyhz g;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygi f = emptyIntList();

    static {
        fahq fahqVar = new fahq();
        b = fahqVar;
        eyfy.registerDefaultInstance(fahq.class, fahqVar);
    }

    private fahq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fahq();
        }
        if (ordinal == 4) {
            return new faho();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fahq.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
