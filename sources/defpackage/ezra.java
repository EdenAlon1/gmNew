package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezra extends eyft implements eyfu {
    public static final ezra a;
    private static volatile eyhz b;
    private byte c = 2;

    static {
        ezra ezraVar = new ezra();
        a = ezraVar;
        eyfy.registerDefaultInstance(ezra.class, ezraVar);
    }

    private ezra() {
        emptyProtobufList();
        emptyLongList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new ezra();
            case NEW_BUILDER:
                return new ezqz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezra.class) {
                    eyhzVar = b;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        b = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
