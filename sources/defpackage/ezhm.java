package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhm extends eyfy implements eyht {
    public static final ezhm a;
    private static volatile eyhz c;
    public ezgy b;
    private int d;
    private ezho e;
    private ezhk f;
    private ezhc g;
    private ezhe h;
    private ezhg i;
    private ezhi j;
    private byte k = 2;

    static {
        ezhm ezhmVar = new ezhm();
        a = ezhmVar;
        eyfy.registerDefaultInstance(ezhm.class, ezhmVar);
    }

    private ezhm() {
        eyee eyeeVar = eyee.b;
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u000f\u0015\u0007\u0000\u0000\u0007\u000fᐉ\r\u0010ᐉ\u000e\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"d", "e", "b", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ezhm();
            case NEW_BUILDER:
                return new ezhl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhm.class) {
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
