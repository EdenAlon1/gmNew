package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezit extends eyft implements eyfu {
    public static final ezit a;
    private static volatile eyhz e;
    public int b;
    public int c;
    private elmg f;
    private byte g = 2;
    public int d = 1;

    static {
        ezit ezitVar = new ezit();
        a = ezitVar;
        eyfy.registerDefaultInstance(ezit.class, ezitVar);
    }

    private ezit() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004᠌\u0004\u0007᠌\u0005", new Object[]{"b", "f", "c", eziu.a, "d", eziw.a});
            case NEW_MUTABLE_INSTANCE:
                return new ezit();
            case NEW_BUILDER:
                return new ezis();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezit.class) {
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
