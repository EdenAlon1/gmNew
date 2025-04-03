package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyu extends eyfy implements eyht {
    public static final esyu a;
    private static volatile eyhz e;
    public int d;
    private byte f = 2;
    public eygr b = emptyProtobufList();
    public String c = "";

    static {
        esyu esyuVar = new esyu();
        a = esyuVar;
        eyfy.registerDefaultInstance(esyu.class, esyuVar);
    }

    private esyu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002Ȉ\u0003\u0004", new Object[]{"b", esxk.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new esyu();
            case NEW_BUILDER:
                return new esyt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (esyu.class) {
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
