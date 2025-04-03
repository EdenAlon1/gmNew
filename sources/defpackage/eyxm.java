package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyxm extends eyfy implements eyht {
    public static final eyxm a;
    private static volatile eyhz u;
    public int b;
    public long c;
    public int d;
    public int f;
    public int g;
    public int i;
    public int k;
    public int o;
    public eyss p;
    public int q;
    public eyxg r;
    public int t;
    public int e = 1;
    public String h = "";
    public String j = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public eygi s = emptyIntList();

    static {
        eyxm eyxmVar = new eyxm();
        a = eyxmVar;
        eyfy.registerDefaultInstance(eyxm.class, eyxmVar);
    }

    private eyxm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0017\u0012\u0000\u0001\u0000\u0001စ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006င\u0006\u0007ဈ\t\bဈ\u000b\t᠌\r\nဉ\u000e\fဈ\u0007\rင\u0010\u0010ဈ\u0005\u0011ဈ\f\u0012ဉ\u0013\u0015င\b\u0016ࠬ\u0017᠌\u0016", new Object[]{"b", "c", "d", evkd.a, "e", evke.a, "f", evkb.a, "g", "i", "l", "m", "o", ezed.a, "p", "j", "q", "h", "n", "r", "k", "s", eyxi.a, "t", eyxk.a});
        }
        if (ordinal == 3) {
            return new eyxm();
        }
        if (ordinal == 4) {
            return new eyxh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = u;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyxm.class) {
            eyhzVar = u;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                u = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
