package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epmn extends eyfy implements eyht {
    public static final epmn a;
    private static volatile eyhz b;
    private byte c = 2;

    static {
        epmn epmnVar = new epmn();
        a = epmnVar;
        eyfy.registerDefaultInstance(epmn.class, epmnVar);
    }

    private epmn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new epmn();
            case NEW_BUILDER:
                return new epmm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epmn.class) {
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
