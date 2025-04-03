package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyna extends eyfy implements eyht {
    public static final eyna a;
    private static volatile eyhz d;
    private byte e = 2;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();

    static {
        eyna eynaVar = new eyna();
        a = eynaVar;
        eyfy.registerDefaultInstance(eyna.class, eynaVar);
    }

    private eyna() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", ezie.class, "c", ezie.class});
            case NEW_MUTABLE_INSTANCE:
                return new eyna();
            case NEW_BUILDER:
                return new eymz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eyna.class) {
                    eyhzVar = d;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        d = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
