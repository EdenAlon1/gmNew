package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckpr extends eyfy implements eyht {
    public static final ckpr a;
    private static volatile eyhz h;
    public long b;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr f = eyfy.emptyProtobufList();
    public String g = "";

    static {
        ckpr ckprVar = new ckpr();
        a = ckprVar;
        eyfy.registerDefaultInstance(ckpr.class, ckprVar);
    }

    private ckpr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ț\u0006Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new ckpr();
        }
        if (ordinal == 4) {
            return new ckpq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ckpr.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
