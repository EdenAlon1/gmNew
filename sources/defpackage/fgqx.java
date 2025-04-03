package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqx extends eyfy implements eyht {
    private static volatile eyhz B;
    public static final fgqx a;
    public fgpi A;
    private fgpn C;
    public int b;
    public long c;
    public fgmq f;
    public fgqz g;
    public fgnc h;
    public fgpu i;
    public fgqm j;
    public fgla k;
    public fgqg l;
    public fgnp m;
    public fgrq n;
    public fgom o;
    public fgrg p;
    public fgks r;
    public fgqv s;
    public fgpf t;
    public fgqa u;
    public fgpl w;
    public fgqt x;
    public fgqc y;
    public fgmh z;
    private byte D = 2;
    public String d = "";
    public String e = "";
    public eygr q = emptyProtobufList();
    public eygr v = emptyProtobufList();

    static {
        fgqx fgqxVar = new fgqx();
        a = fgqxVar;
        eyfy.registerDefaultInstance(fgqx.class, fgqxVar);
    }

    private fgqx() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001(\u001a\u0000\u0002\f\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011!ဉ\u0012#ဉ\r$ᐉ\u000e%Л&\u001b(ᐉ\f", new Object[]{"b", "f", "c", "d", "g", "w", "h", "i", "x", "j", "k", "l", "z", "m", "e", "A", "y", "C", "t", "u", "r", "s", "o", "p", "q", fgri.class, "v", fgqi.class, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new fgqx();
            case NEW_BUILDER:
                return new fgqw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = B;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgqx.class) {
                    eyhzVar = B;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        B = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
