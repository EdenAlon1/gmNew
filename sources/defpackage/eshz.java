package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshz extends eyfy implements eyht {
    public static final eshz a;
    private static volatile eyhz u;
    public int b;
    public int d;
    public esih e;
    public eshp f;
    public boolean h;
    public boolean i;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public String c = "";
    public eygr g = eyfy.emptyProtobufList();
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    static {
        eshz eshzVar = new eshz();
        a = eshzVar;
        eyfy.registerDefaultInstance(eshz.class, eshzVar);
    }

    private eshz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0007\u0007Ȉ\bȈ\t\f\n\f\u000b\f\f\u0007\rȈ\u000eȈ\u000f\u0002\u0010\u0004\u0012\u0007\u0013\f", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "p", "q", "r", "h", "l", "m", "n", "o", "s", "t"});
        }
        if (ordinal == 3) {
            return new eshz();
        }
        if (ordinal == 4) {
            return new eshy();
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
        synchronized (eshz.class) {
            eyhzVar = u;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                u = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
