package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exeb extends eyfy implements eyht {
    public static final exeb a;
    private static volatile eyhz c;
    private byte d = 2;
    public eygr b = emptyProtobufList();

    static {
        exeb exebVar = new exeb();
        a = exebVar;
        eyfy.registerDefaultInstance(exeb.class, exebVar);
    }

    private exeb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", exeh.class});
            case NEW_MUTABLE_INSTANCE:
                return new exeb();
            case NEW_BUILDER:
                return new exea();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (exeb.class) {
                    eyhzVar = c;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        c = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
