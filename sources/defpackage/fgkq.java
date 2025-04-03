package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkq extends eyfy implements eyht {
    public static final fgkq a;
    private static volatile eyhz p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public fgkl l;
    public fgmh m;
    public fgrc n;
    public fgrk o;
    private byte q = 2;
    public String c = "";

    static {
        fgkq fgkqVar = new fgkq();
        a = fgkqVar;
        eyfy.registerDefaultInstance(fgkq.class, fgkqVar);
    }

    private fgkq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", fgko.a, "e", "f", fgkn.a, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new fgkq();
            case NEW_BUILDER:
                return new fgkm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = p;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgkq.class) {
                    eyhzVar = p;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        p = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
