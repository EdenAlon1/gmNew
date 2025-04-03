package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eule extends eyfy implements eyht {
    public static final eule a;
    private static volatile eyhz e;
    public eygr c;
    public eygr d;
    private byte f = 2;
    public eygr b = emptyProtobufList();

    static {
        eule euleVar = new eule();
        a = euleVar;
        eyfy.registerDefaultInstance(eule.class, euleVar);
    }

    private eule() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.c = eyfy.emptyProtobufList();
        this.d = eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u000f\u0003\u0000\u0003\u0001\u0001Л\nȚ\u000fȚ", new Object[]{"b", euld.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new eule();
            case NEW_BUILDER:
                return new eulb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eule.class) {
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
