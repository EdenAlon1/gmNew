package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrn extends eyfy implements eyht {
    public static final fgrn a;
    private static volatile eyhz p;
    public int b;
    public int d;
    public int e;
    public eyev f;
    public eyev g;
    public eyev h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public fgmh m;
    public long n;
    public long o;
    private byte q = 2;
    public String c = "";

    static {
        fgrn fgrnVar = new fgrn();
        a = fgrnVar;
        eyfy.registerDefaultInstance(fgrn.class, fgrnVar);
    }

    private fgrn() {
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
                return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bᐉ\n\fဂ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", fgrm.a, "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new fgrn();
            case NEW_BUILDER:
                return new fgrl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = p;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgrn.class) {
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
