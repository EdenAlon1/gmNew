package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class farg extends eyft implements eyfu {
    public static final farg a;
    private static volatile eyhz b;
    private int c;
    private faro d;
    private byte e = 2;

    static {
        farg fargVar = new farg();
        a = fargVar;
        eyfy.registerDefaultInstance(farg.class, fargVar);
    }

    private farg() {
        eyfy.emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဉ\u0004", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new farg();
            case NEW_BUILDER:
                return new farf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (farg.class) {
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
