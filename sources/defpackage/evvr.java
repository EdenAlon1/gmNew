package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evvr extends eyfy implements eyht {
    public static final evvr a;
    private static volatile eyhz v;
    public int b;
    public int d;
    public long g;
    public int i;
    public boolean j;
    public int m;
    public int n;
    public int o;
    public int q;
    public evvi r;
    public exst s;
    public int t;
    public eygi c = emptyIntList();
    public eyee e = eyee.b;
    public String f = "";
    public String h = "";
    public eygi k = emptyIntList();
    public eygi l = emptyIntList();
    public String p = "";
    public String u = "";

    static {
        evvr evvrVar = new evvr();
        a = evvrVar;
        eyfy.registerDefaultInstance(evvr.class, evvrVar);
    }

    private evvr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0013\u0000\u0001\u0001\u0018\u0013\u0000\u0003\u0000\u0001\u0016\u0002င\u0000\u0003င\u0007\u0004ဇ\b\u0005ࠞ\u0006᠌\n\u0007᠌\u000b\t᠌\t\u000bဈ\r\fဉ\u0010\rဈ\u0004\u000eဂ\u0005\u000fဈ\u0006\u0010ဉ\u0011\u0011᠌\u0012\u0012ࠞ\u0014ည\u0002\u0017᠌\u000f\u0018ဈ\u0013", new Object[]{"b", "c", "d", "i", "j", "l", evvb.a, "n", evvc.a, "o", evvp.a, "m", evvk.a, "p", "r", "f", "g", "h", "s", "t", evvj.a, "k", evvn.a, "e", "q", evvm.a, "u"});
        }
        if (ordinal == 3) {
            return new evvr();
        }
        if (ordinal == 4) {
            return new evva();
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
        synchronized (evvr.class) {
            eyhzVar = v;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                v = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
