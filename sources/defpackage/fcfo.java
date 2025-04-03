package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcfo extends eyfy implements eyht {
    public static final fcfo a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public String e = "";
    public eyee f = eyee.b;
    public fceg g;
    public fcek h;
    public fjbb i;
    public int j;

    static {
        fcfo fcfoVar = new fcfo();
        a = fcfoVar;
        eyfy.registerDefaultInstance(fcfo.class, fcfoVar);
    }

    private fcfo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001Ê\b\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006\n\u0007ဉ\u0000\t\n\nဉ\u0001\u0010ဉ\u0005Ê\f", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new fcfo();
        }
        if (ordinal == 4) {
            return new fcfn();
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
        synchronized (fcfo.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
