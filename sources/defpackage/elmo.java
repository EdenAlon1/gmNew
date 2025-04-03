package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmo extends eyfy implements eyht {
    public static final elmo a;
    private static volatile eyhz b;
    private int c;
    private elml d;
    private eyhm e = eyhm.a;
    private byte f = 2;

    static {
        elmo elmoVar = new elmo();
        a = elmoVar;
        eyfy.registerDefaultInstance(elmo.class, elmoVar);
    }

    private elmo() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\b\u0016\u0002\u0001\u0000\u0001\bᐉ\b\u00162", new Object[]{"c", "d", "e", elmm.a});
            case NEW_MUTABLE_INSTANCE:
                return new elmo();
            case NEW_BUILDER:
                return new elmn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (elmo.class) {
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
