package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbun extends eyfy implements eyht {
    public static final fbun a;
    private static volatile eyhz h;
    public Object c;
    public long e;
    public int b = 0;
    private byte i = 2;
    public String d = "";
    public eygr f = emptyProtobufList();
    public eygr g = emptyProtobufList();

    static {
        fbun fbunVar = new fbun();
        a = fbunVar;
        eyfy.registerDefaultInstance(fbun.class, fbunVar);
    }

    private fbun() {
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
                return newMessageInfo(a, "\u0000\u0007\u0001\u0000\u0001\"\u0007\u0000\u0002\u0001\u0001Ȉ\u0002\u0002\u001eȻ\u0000\u001f<\u0000 Л!\u001b\"<\u0000", new Object[]{"c", "b", "d", "e", fbua.class, "f", fbuk.class, "g", fbxa.class, fbsb.class});
            case NEW_MUTABLE_INSTANCE:
                return new fbun();
            case NEW_BUILDER:
                return new fbum();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fbun.class) {
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
