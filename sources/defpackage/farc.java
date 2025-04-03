package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class farc extends eyft implements eyfu {
    public static final farc a;
    private static volatile eyhz d;
    public farq c;
    private int e;
    private faro f;
    private byte g = 2;
    public eygr b = eyfy.emptyProtobufList();

    static {
        farc farcVar = new farc();
        a = farcVar;
        eyfy.registerDefaultInstance(farc.class, farcVar);
    }

    private farc() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"e", "b", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new farc();
            case NEW_BUILDER:
                return new farb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (farc.class) {
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
