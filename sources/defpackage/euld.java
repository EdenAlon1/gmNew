package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euld extends eyfy implements eyht {
    public static final euld a;
    private static volatile eyhz h;
    public int b;
    public eula g;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public eygr e = eyfy.emptyProtobufList();
    public eygr f = eyfy.emptyProtobufList();

    static {
        euld euldVar = new euld();
        a = euldVar;
        eyfy.registerDefaultInstance(euld.class, euldVar);
    }

    private euld() {
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        eyfy.emptyProtobufList();
        eyfy.emptyProtobufList();
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
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0001\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț\u0007ᐉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new euld();
            case NEW_BUILDER:
                return new eulc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (euld.class) {
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
