package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emle extends eyfy implements eyht {
    public static final emle a;
    private static volatile eyhz l;
    public int b;
    public emiu c;
    public emjm d;
    public emhv e;
    public emla g;
    public emlg h;
    public boolean i;
    public boolean j;
    public emky k;
    private byte m = 2;
    public eygr f = emptyProtobufList();

    static {
        emle emleVar = new emle();
        a = emleVar;
        eyfy.registerDefaultInstance(emle.class, emleVar);
    }

    private emle() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0003\u000f\t\u0000\u0001\u0001\u0003ဉ\u0000\bဉ\u0002\tᐉ\u0001\nဉ\u0003\u000b\u001b\fဉ\u0004\rဇ\u0005\u000eဉ\u0007\u000fဇ\u0006", new Object[]{"b", "c", "e", "d", "g", "f", emhv.class, "h", "i", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new emle();
            case NEW_BUILDER:
                return new emld();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emle.class) {
                    eyhzVar = l;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        l = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
