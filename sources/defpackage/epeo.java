package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epeo extends eyfy implements eyht {
    public static final epeo a;
    private static volatile eyhz v;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    static {
        epeo epeoVar = new epeo();
        a = epeoVar;
        eyfy.registerDefaultInstance(epeo.class, epeoVar);
    }

    private epeo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\t\nဂ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဋ\u000f\u0010ဋ\u0010\u0011ဋ\u0011\u0012ဋ\u0012\u0013ဂ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "k"});
        }
        if (ordinal == 3) {
            return new epeo();
        }
        if (ordinal == 4) {
            return new epen();
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
        synchronized (epeo.class) {
            eyhzVar = v;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                v = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
