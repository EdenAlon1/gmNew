package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emoh extends eyfy implements eyht {
    public static final emoh a;
    private static volatile eyhz h;
    public int b;
    public faqe c;
    public faqa d;
    public eyhm g = eyhm.a;
    private byte i = 2;
    public eygr e = emptyProtobufList();
    public String f = "";

    static {
        emoh emohVar = new emoh();
        a = emohVar;
        eyfy.registerDefaultInstance(emoh.class, emohVar);
    }

    private emoh() {
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003\u001b\u0004ဈ\u0002\u00052", new Object[]{"b", "c", "d", "e", emoe.class, "f", "g", emof.a});
            case NEW_MUTABLE_INSTANCE:
                return new emoh();
            case NEW_BUILDER:
                return new emog();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emoh.class) {
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
