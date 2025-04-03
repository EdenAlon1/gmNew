package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoli extends eyfy implements eyht {
    public static final eoli a;
    private static volatile eyhz v;
    public int b;
    public int e;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public eowq q;
    public eoqb s;
    public int u;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";
    public String r = "";
    public int t = -1;

    static {
        eoli eoliVar = new eoli();
        a = eoliVar;
        eyfy.registerDefaultInstance(eoli.class, eoliVar);
    }

    private eoli() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eohy.a;
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006᠌\u0006\u0007᠌\u0007\b᠌\b\t᠌\t\n᠌\n\u000b᠌\u000b\f᠌\f\r᠌\r\u000eဉ\u000e\u000fဈ\u0001\u0010ဈ\u000f\u0011ဉ\u0010\u0012᠌\u0011\u0013᠌\u0012", new Object[]{"b", "c", "e", eolg.a, "f", "g", "h", eyggVar, "i", eyggVar, "j", eyggVar, "k", eyggVar, "l", eyggVar, "m", eyggVar, "n", eolf.a, "o", eqwe.a, "p", eool.a, "q", "d", "r", "s", "t", eogs.a, "u", eovv.a});
        }
        if (ordinal == 3) {
            return new eoli();
        }
        if (ordinal == 4) {
            return new eole();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = v;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoli.class) {
            eyhzVar = v;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                v = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
