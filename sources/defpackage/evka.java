package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evka extends eyfy implements eyht {
    public static final evka a;
    private static volatile eyhz c;
    private byte d = 2;
    public eygr b = emptyProtobufList();

    static {
        evka evkaVar = new evka();
        a = evkaVar;
        eyfy.registerDefaultInstance(evka.class, evkaVar);
    }

    private evka() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", evjw.class});
            case NEW_MUTABLE_INSTANCE:
                return new evka();
            case NEW_BUILDER:
                return new evjz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evka.class) {
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
