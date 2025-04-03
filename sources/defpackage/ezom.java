package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezom extends eyft implements eyfu {
    public static final ezom a;
    private static volatile eyhz h;
    public int b;
    public evju c;
    public ezok e;
    public exjy f;
    private byte i = 2;
    public String d = "";
    public String g = "";

    static {
        ezom ezomVar = new ezom();
        a = ezomVar;
        eyfy.registerDefaultInstance(ezom.class, ezomVar);
    }

    private ezom() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001c\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003cဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ezom();
            case NEW_BUILDER:
                return new ezol();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezom.class) {
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
