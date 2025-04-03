package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezkr extends eyfy implements eyht {
    public static final ezkr a;
    private static volatile eyhz s;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public boolean r;

    static {
        ezkr ezkrVar = new ezkr();
        a = ezkrVar;
        eyfy.registerDefaultInstance(ezkr.class, ezkrVar);
    }

    private ezkr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000eင\r\u000fင\u000e\u0010ဇ\u000f\u0011င\u0010\u0012င\u0011\u0013ဇ\u0012", new Object[]{"b", "c", ezko.a, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        }
        if (ordinal == 3) {
            return new ezkr();
        }
        if (ordinal == 4) {
            return new ezkq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezkr.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
