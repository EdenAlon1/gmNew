package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezjb extends eyft implements eyfu {
    public static final ezjb a;
    private static volatile eyhz h;
    public int b;
    public int c;
    private byte i = 2;
    public String d = "";
    public eygr e = emptyProtobufList();
    public eygr f = emptyProtobufList();
    public String g = "";

    static {
        ezjb ezjbVar = new ezjb();
        a = ezjbVar;
        eyfy.registerDefaultInstance(ezjb.class, ezjbVar);
    }

    private ezjb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0004ဈ\u0002\u0005Л\u0006Л\bဈ\u0005", new Object[]{"b", "c", ezia.a, "d", "e", ezie.class, "f", ezie.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ezjb();
            case NEW_BUILDER:
                return new ezja();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezjb.class) {
                    eyhzVar = h;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        h = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
