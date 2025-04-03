package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhu extends eyfy implements eyht {
    public static final ezhu a;
    private static volatile eyhz h;
    public int b;
    public int c;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public eygr f = emptyProtobufList();
    public eygr g = emptyProtobufList();

    static {
        ezhu ezhuVar = new ezhu();
        a = ezhuVar;
        eyfy.registerDefaultInstance(ezhu.class, ezhuVar);
    }

    private ezhu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004Л\u0005Л", new Object[]{"b", "c", ezia.a, "d", "e", "f", ezie.class, "g", ezie.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezhu();
            case NEW_BUILDER:
                return new ezht();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhu.class) {
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
