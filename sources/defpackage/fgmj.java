package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmj extends eyfy implements eyht {
    public static final fgmj a;
    private static volatile eyhz z;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    static {
        fgmj fgmjVar = new fgmj();
        a = fgmjVar;
        eyfy.registerDefaultInstance(fgmj.class, fgmjVar);
    }

    private fgmj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u0018\u0017\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
        }
        if (ordinal == 3) {
            return new fgmj();
        }
        if (ordinal == 4) {
            return new fgmi();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = z;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgmj.class) {
            eyhzVar = z;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                z = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
