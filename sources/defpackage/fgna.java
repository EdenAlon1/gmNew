package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgna extends eyfy implements eyht {
    private static volatile eyhz A;
    public static final fgna a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public fgoz l;
    public int m;
    public fgmw n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public eygl v;
    public String w;
    public fgnj x;
    public fgms y;
    public long z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        fgna fgnaVar = new fgna();
        a = fgnaVar;
        eyfy.registerDefaultInstance(fgna.class, fgnaVar);
    }

    private fgna() {
        emptyProtobufList();
        this.u = "";
        this.v = emptyLongList();
        this.w = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001aဉ\u0017\u001b᠌\f\u001cဂ\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", fgng.a, "l", "n", "p", "q", fgnh.a, "r", fgne.a, "t", "u", "s", "w", "v", "x", "m", fgmy.a, "e", "y", "o", fgnd.a, "z"});
            case NEW_MUTABLE_INSTANCE:
                return new fgna();
            case NEW_BUILDER:
                return new fgmx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = A;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgna.class) {
                    eyhzVar = A;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        A = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
