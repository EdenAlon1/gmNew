package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exeh extends eyfy implements eyht {
    public static final exeh a;
    private static volatile eyhz e;
    public Object c;
    private int f;
    public int b = 0;
    private byte g = 2;
    public String d = "";

    static {
        exeh exehVar = new exeh();
        a = exehVar;
        eyfy.registerDefaultInstance(exeh.class, exehVar);
    }

    private exeh() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ለ\u0000\u0002м\u0000\u0003<\u0000", new Object[]{"c", "b", "f", "d", exee.class, exeg.class});
            case NEW_MUTABLE_INSTANCE:
                return new exeh();
            case NEW_BUILDER:
                return new exec();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (exeh.class) {
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
