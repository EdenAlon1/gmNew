package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewsi extends eyfy implements eyht {
    public static final ewsi a;
    private static volatile eyhz h;
    public int b;
    public eisi d;
    public eyfh e;
    public int f;
    public boolean g;
    private byte i = 2;
    public String c = "";

    static {
        ewsi ewsiVar = new ewsi();
        a = ewsiVar;
        eyfy.registerDefaultInstance(ewsi.class, ewsiVar);
    }

    private ewsi() {
        emptyIntList();
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
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001Ȉ\u0002ᐉ\u0000\u0003ဉ\u0001\u0004\f\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ewsi();
            case NEW_BUILDER:
                return new ewsh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ewsi.class) {
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
