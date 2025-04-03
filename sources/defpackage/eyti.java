package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyti extends eyfy implements eyht {
    public static final eyti a;
    private static volatile eyhz r;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public String l = "";
    public long m;
    public long n;
    public boolean o;
    public eyth p;
    public long q;

    static {
        eyti eytiVar = new eyti();
        a = eytiVar;
        eyfy.registerDefaultInstance(eyti.class, eytiVar);
    }

    private eyti() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eytl.a;
            eygg eyggVar2 = ezek.a;
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\b᠌\u0007\t᠌\b\nဈ\t\u000bဂ\n\fဂ\u000b\rဇ\f\u000eဉ\r\u000fဂ\u000e", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eytj.a, "f", eytn.a, "g", "h", "i", "j", eyggVar2, "k", eyggVar2, "l", "m", "n", "o", "p", "q"});
        }
        if (ordinal == 3) {
            return new eyti();
        }
        if (ordinal == 4) {
            return new eytf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = r;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eyti.class) {
            eyhzVar = r;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                r = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
