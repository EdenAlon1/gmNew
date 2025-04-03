package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chod extends eyfy implements eyht {
    public static final chod a;
    private static volatile eyhz w;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public long e;
    public eyee f;
    public eyee g;
    public eyee h;
    public int i;
    public int j;
    public int k;
    public fcee l;
    public fcee m;
    public fceb n;
    public fceb o;
    public String p;
    public long q;
    public int r;
    public fcks s;
    public fcks t;
    public String u;
    public eyee v;

    static {
        chod chodVar = new chod();
        a = chodVar;
        eyfy.registerDefaultInstance(chod.class, chodVar);
    }

    private chod() {
        eyee eyeeVar = eyee.b;
        this.f = eyeeVar;
        this.g = eyeeVar;
        this.h = eyeeVar;
        this.p = "";
        this.u = "";
        this.v = eyeeVar;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0014\u0000\u0001\u0001\u0017\u0014\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\b\n\t\f\n\f\u000b\f\fဉ\u0000\rဉ\u0001\u000eဉ\u0002\u000fဉ\u0003\u0010Ȉ\u0011\u0002\u0012\u0004\u0013ဉ\u0004\u0014ဉ\u0005\u0015ለ\u0006\u0017ည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
        }
        if (ordinal == 3) {
            return new chod();
        }
        if (ordinal == 4) {
            return new choa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = w;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (chod.class) {
            eyhzVar = w;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                w = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
