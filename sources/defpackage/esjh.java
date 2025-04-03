package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjh extends eyfy implements eyht {
    public static final esjh a;
    private static volatile eyhz y;
    public int b;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public esir m;
    public esiy n;
    public esjp o;
    public esjr s;
    public esjv t;
    public boolean u;
    private byte z = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public eygr p = emptyProtobufList();
    public eygr q = emptyProtobufList();
    public eygr r = emptyProtobufList();
    public String v = "";
    public String w = "";
    public String x = "";

    static {
        esjh esjhVar = new esjh();
        a = esjhVar;
        eyfy.registerDefaultInstance(esjh.class, esjhVar);
    }

    private esjh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0003\u0001\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0002\u0007\f\b\f\t\f\nဉ\u0000\u000bဉ\u0001\fဉ\u0002\r\u001b\u000eЛ\u000f\u001b\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0007\u0013ለ\u0005\u0014\u0002\u0015ለ\u0006\u0016Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", esjl.class, "q", esjf.class, "r", esit.class, "s", "t", "u", "v", "i", "w", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new esjh();
            case NEW_BUILDER:
                return new esjg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = y;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (esjh.class) {
                    eyhzVar = y;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        y = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
