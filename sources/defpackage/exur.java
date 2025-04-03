package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exur extends eyfy implements eyht {
    public static final exur a;
    private static volatile eyhz h;
    public int b;
    public exqe c;
    public exvr d;
    private byte i = 2;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        exur exurVar = new exur();
        a = exurVar;
        eyfy.registerDefaultInstance(exur.class, exurVar);
    }

    private exur() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new exur();
            case NEW_BUILDER:
                return new exuq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (exur.class) {
                    eyhzVar = h;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        h = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
