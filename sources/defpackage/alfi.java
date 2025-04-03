package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfi extends eyfy implements eyht {
    public static final alfi a;
    private static volatile eyhz o;
    public int b;
    public long c = -1;
    public long d = -1;
    public boolean e = true;
    public long f = -1;
    public long g = -1;
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public String k;
    public eyja l;
    public eyja m;
    public long n;

    static {
        alfi alfiVar = new alfi();
        a = alfiVar;
        eyfy.registerDefaultInstance(alfi.class, alfiVar);
    }

    private alfi() {
        eyfy.emptyProtobufList();
        this.k = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\u000bဈ\t\fဉ\n\rဂ\f\u000eဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m"});
        }
        if (ordinal == 3) {
            return new alfi();
        }
        if (ordinal == 4) {
            return new alfh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (alfi.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
