package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwns extends eyfy implements eyht {
    public static final dwns a;
    private static volatile eyhz o;
    public int b;
    public int f;
    public int g;
    public long i;
    public eydq l;
    public eydq m;
    private byte p = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public eygr h = emptyProtobufList();
    public String j = "";
    public eygr k = eyfy.emptyProtobufList();
    public String n = "";

    static {
        dwns dwnsVar = new dwns();
        a = dwnsVar;
        eyfy.registerDefaultInstance(dwns.class, dwnsVar);
    }

    private dwns() {
    }

    public final void a() {
        eygr eygrVar = this.h;
        if (eygrVar.c()) {
            return;
        }
        this.h = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000fဈ\n", new Object[]{"b", "c", "h", dwno.class, "d", "f", "g", dwnq.a, "e", "i", "k", "l", "j", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new dwns();
            case NEW_BUILDER:
                return new dwnp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = o;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dwns.class) {
                    eyhzVar = o;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        o = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
