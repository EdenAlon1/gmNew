package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyn extends eyfy implements eyht {
    public static final epyn a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        epyn epynVar = new epyn();
        a = epynVar;
        eyfy.registerDefaultInstance(epyn.class, epynVar);
    }

    private epyn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new epyn();
        }
        if (ordinal == 4) {
            return new epym();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epyn.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
