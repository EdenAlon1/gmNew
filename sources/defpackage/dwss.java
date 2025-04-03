package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwss extends eyfy implements eyht {
    public static final dwss a;
    private static volatile eyhz h;
    public int b;
    public long d;
    public int f;
    public dwsa g;
    public String c = "";
    public String e = "";

    static {
        dwss dwssVar = new dwss();
        a = dwssVar;
        eyfy.registerDefaultInstance(dwss.class, dwssVar);
    }

    private dwss() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", dwsq.a, "g"});
        }
        if (ordinal == 3) {
            return new dwss();
        }
        if (ordinal == 4) {
            return new dwsp();
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
        synchronized (dwss.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
