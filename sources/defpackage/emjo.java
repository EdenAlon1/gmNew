package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjo extends eyfy implements eyht {
    public static final emjo a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public emjo e;
    public int c = 0;
    private byte g = 2;

    static {
        emjo emjoVar = new emjo();
        a = emjoVar;
        eyfy.registerDefaultInstance(emjo.class, emjoVar);
    }

    private emjo() {
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
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0004\r\b\u0000\u0000\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\tм\u0000\u000bᐉ\u0001\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", emhv.class, emhv.class, emhv.class, emjc.class, emoh.class, "e", emim.class, emji.class});
            case NEW_MUTABLE_INSTANCE:
                return new emjo();
            case NEW_BUILDER:
                return new emjn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emjo.class) {
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
