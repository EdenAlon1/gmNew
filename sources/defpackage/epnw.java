package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnw extends eyft implements eyfu {
    public static final epnw a;
    private static volatile eyhz k;
    public int b;
    public erhk c;
    public int e;
    public int f;
    public int g;
    public epmc j;
    private byte l = 2;
    public int d = -1;
    public int h = -1;
    public eygr i = emptyProtobufList();

    static {
        epnw epnwVar = new epnw();
        a = epnwVar;
        eyfy.registerDefaultInstance(epnw.class, epnwVar);
    }

    private epnw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", epoa.class, "j", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new epnw();
            case NEW_BUILDER:
                return new epnv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epnw.class) {
                    eyhzVar = k;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        k = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
