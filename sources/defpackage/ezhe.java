package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhe extends eyfy implements eyht {
    public static final ezhe a;
    private static volatile eyhz b;
    private int c;
    private ezha d;
    private byte e = 2;

    static {
        ezhe ezheVar = new ezhe();
        a = ezheVar;
        eyfy.registerDefaultInstance(ezhe.class, ezheVar);
    }

    private ezhe() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ezhe();
            case NEW_BUILDER:
                return new ezhd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhe.class) {
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
