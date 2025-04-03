package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fapy extends eyfy implements eyht {
    public static final fapy a;
    private static volatile eyhz e;
    public int b;
    private byte g = 2;
    public String c = "";
    public eyee d = eyee.b;
    private String f = "";

    static {
        fapy fapyVar = new fapy();
        a = fapyVar;
        eyfy.registerDefaultInstance(fapy.class, fapyVar);
    }

    private fapy() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001ᔈ\u0000\u0003ည\u0002\u0004ᔈ\u0003", new Object[]{"b", "c", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fapy();
            case NEW_BUILDER:
                return new fapx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fapy.class) {
                    eyhzVar = e;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        e = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
