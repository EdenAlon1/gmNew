package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exus extends eyfy implements eyht {
    public static final exus a;
    private static volatile eyhz e;
    public long d;
    private int f;
    private byte g = 2;
    public eygr b = emptyProtobufList();
    public String c = "";

    static {
        exus exusVar = new exus();
        a = exusVar;
        eyfy.registerDefaultInstance(exus.class, exusVar);
    }

    private exus() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new Object[]{"f", "b", exur.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new exus();
            case NEW_BUILDER:
                return new exup();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (exus.class) {
                    eyhzVar = e;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        e = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
