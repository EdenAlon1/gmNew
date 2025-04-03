package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmg extends eyfy implements eyht {
    public static final elmg a;
    private static volatile eyhz b;
    private int c;
    private elmo d;
    private elmj e;
    private byte f = 2;

    static {
        elmg elmgVar = new elmg();
        a = elmgVar;
        eyfy.registerDefaultInstance(elmg.class, elmgVar);
    }

    private elmg() {
        eyfy.emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u000f\u0002\u0000\u0000\u0001\u0006ᐉ\u0007\u000fဉ\u0010", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new elmg();
            case NEW_BUILDER:
                return new elmf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (elmg.class) {
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
