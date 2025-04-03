package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhu extends eyfy implements eyht {
    public static final erhu a;
    private static volatile eyhz g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public eygr f = emptyProtobufList();

    static {
        erhu erhuVar = new erhu();
        a = erhuVar;
        eyfy.registerDefaultInstance(erhu.class, erhuVar);
    }

    private erhu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", erht.class});
            case NEW_MUTABLE_INSTANCE:
                return new erhu();
            case NEW_BUILDER:
                return new erhr();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (erhu.class) {
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
