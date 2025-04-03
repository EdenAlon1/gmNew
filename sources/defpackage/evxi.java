package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxi extends eyfy implements eyht {
    public static final evxi a;
    private static volatile eyhz k;
    public int b;
    public Object d;
    public int e;
    public faul g;
    public faul h;
    public int j;
    public int c = 0;
    public String f = "";
    public eygr i = emptyProtobufList();

    static {
        evxi evxiVar = new evxi();
        a = evxiVar;
        eyfy.registerDefaultInstance(evxi.class, evxiVar);
    }

    private evxi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0001\u0001\u000e\t\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003;\u0000\u0006ဉ\u0002\b<\u0000\t᠌\u0004\nဉ\u0003\u000b\u001b\u000e<\u0000", new Object[]{"d", "c", "b", "e", evxf.a, "f", "g", evvx.class, "j", evxd.a, "h", "i", evzn.class, evwy.class});
        }
        if (ordinal == 3) {
            return new evxi();
        }
        if (ordinal == 4) {
            return new evxh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evxi.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
