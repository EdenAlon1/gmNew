package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emru extends eyfy implements eyht {
    public static final emru a;
    private static volatile eyhz d;
    private byte e = 2;
    public eygr b = emptyProtobufList();
    public eyee c = eyee.b;

    static {
        emru emruVar = new emru();
        a = emruVar;
        eyfy.registerDefaultInstance(emru.class, emruVar);
    }

    private emru() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004\n", new Object[]{"b", emsn.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new emru();
            case NEW_BUILDER:
                return new emrt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emru.class) {
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
