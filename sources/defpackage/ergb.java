package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergb extends eyfy implements eyht {
    public static final ergb a;
    private static volatile eyhz b;
    private int c;
    private erfl d;
    private byte e = 2;

    static {
        ergb ergbVar = new ergb();
        a = ergbVar;
        eyfy.registerDefaultInstance(ergb.class, ergbVar);
    }

    private ergb() {
        eyfy.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ergb();
            case NEW_BUILDER:
                return new erga();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ergb.class) {
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
