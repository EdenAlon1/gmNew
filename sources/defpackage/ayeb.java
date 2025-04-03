package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayeb extends eyfy implements eyht {
    public static final ayeb a;
    private static volatile eyhz w;
    public int b;
    public long c;
    public long d;
    public long i;
    public int n;
    public eyja s;
    public int v;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public eygr t = emptyProtobufList();
    public String u = "";

    static {
        ayeb ayebVar = new ayeb();
        a = ayebVar;
        eyfy.registerDefaultInstance(ayeb.class, ayebVar);
    }

    private ayeb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u0002\bለ\u0000\tለ\u0001\nለ\u0002\u000bለ\u0003\f\u0004\rለ\u0004\u000eለ\u0005\u000fለ\u0006\u0010ለ\u0007\u0011ဉ\b\u0012\u001b\u0013ለ\t\u0014င\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", ayea.class, "u", "v"});
        }
        if (ordinal == 3) {
            return new ayeb();
        }
        if (ordinal == 4) {
            return new aydy();
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
        synchronized (ayeb.class) {
            eyhzVar = w;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                w = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
