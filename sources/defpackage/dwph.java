package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwph extends eyft implements eyfu {
    public static final dwph a;
    private static volatile eyhz s;
    public int b;
    public long e;
    public int f;
    public fasl h;
    public long j;
    public fasl k;
    public int m;
    public int n;
    public eydq q;
    private byte t = 2;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public eygr l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        dwph dwphVar = new dwph();
        a = dwphVar;
        eyfy.registerDefaultInstance(dwph.class, dwphVar);
    }

    private dwph() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000f᠌\u0003\u0010ဂ\u0007\u0011᠌\t\u0012᠌\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", dwpn.class, "i", "f", dwpf.a, "j", "m", dwpc.a, "n", dwpa.a, "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new dwph();
            case NEW_BUILDER:
                return new dwpe();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = s;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dwph.class) {
                    eyhzVar = s;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        s = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
