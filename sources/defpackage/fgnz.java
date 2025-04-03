package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnz extends eyfy implements eyht {
    public static final fgnz a;
    private static volatile eyhz x;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public int s;
    public boolean t;
    public fgnu u;
    public fgnu v;
    public eyhm w = eyhm.a;

    static {
        fgnz fgnzVar = new fgnz();
        a = fgnzVar;
        eyfy.registerDefaultInstance(fgnz.class, fgnzVar);
    }

    private fgnz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016᠌\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"b", "c", "f", "i", "k", "l", "q", "r", "u", "v", "d", "e", "w", fgnw.a, "g", "j", "h", "m", "n", "s", fgnx.a, "o", "p", "t"});
        }
        if (ordinal == 3) {
            return new fgnz();
        }
        if (ordinal == 4) {
            return new fgnv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = x;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgnz.class) {
            eyhzVar = x;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                x = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
