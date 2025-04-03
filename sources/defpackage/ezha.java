package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezha extends eyfy implements eyht {
    public static final ezha a;
    private static volatile eyhz b;
    private int c;
    private ezho d;
    private ezgy e;
    private byte f = 2;

    static {
        ezha ezhaVar = new ezha();
        a = ezhaVar;
        eyfy.registerDefaultInstance(ezha.class, ezhaVar);
    }

    private ezha() {
        eyee eyeeVar = eyee.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ezha();
            case NEW_BUILDER:
                return new ezgz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezha.class) {
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
