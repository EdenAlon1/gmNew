package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjy extends eyfy implements eyht {
    public static final evjy a;
    private static volatile eyhz e;
    public int b;
    private byte f = 2;
    public eygr c = emptyProtobufList();
    public eyee d = eyee.b;

    static {
        evjy evjyVar = new evjy();
        a = evjyVar;
        eyfy.registerDefaultInstance(evjy.class, evjyVar);
    }

    private evjy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0001\u0001Л\u0005ည\u0000", new Object[]{"b", "c", evka.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new evjy();
            case NEW_BUILDER:
                return new evjx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evjy.class) {
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
