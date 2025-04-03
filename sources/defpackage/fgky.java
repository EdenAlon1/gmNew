package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgky extends eyfy implements eyht {
    public static final fgky a;
    private static volatile eyhz m;
    public int b;
    public int c;
    public long d;
    public fgmh g;
    public int h;
    public long i;
    public fglq j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        fgky fgkyVar = new fgky();
        a = fgkyVar;
        eyfy.registerDefaultInstance(fgky.class, fgkyVar);
    }

    private fgky() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                eygg eyggVar = fgkw.a;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", eyggVar, "h", eyggVar, "i", "j", "k", "d", "e", "f", "g", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new fgky();
            case NEW_BUILDER:
                return new fgkv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = m;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgky.class) {
                    eyhzVar = m;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        m = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
