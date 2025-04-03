package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezie extends eyft implements eyfu {
    public static final ezie a;
    private static volatile eyhz f;
    public int b;
    public eypw c;
    public eydq e;
    private byte g = 2;
    public String d = "";

    static {
        ezie ezieVar = new ezie();
        a = ezieVar;
        eyfy.registerDefaultInstance(ezie.class, ezieVar);
    }

    private ezie() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0006ဉ\u0000", new Object[]{"b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ezie();
            case NEW_BUILDER:
                return new ezid();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezie.class) {
                    eyhzVar = f;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        f = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
