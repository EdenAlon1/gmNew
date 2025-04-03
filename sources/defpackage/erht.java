package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erht extends eyfy implements eyht {
    public static final erht a;
    private static volatile eyhz g;
    public int b;
    public int f;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        erht erhtVar = new erht();
        a = erhtVar;
        eyfy.registerDefaultInstance(erht.class, erhtVar);
    }

    private erht() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new erht();
            case NEW_BUILDER:
                return new erhs();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (erht.class) {
                    eyhzVar = g;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        g = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
