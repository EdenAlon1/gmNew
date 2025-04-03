package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhv extends eyfy implements eyht {
    public static final ezhv a;
    private static volatile eyhz g;
    public int b;
    public ezit e;
    private byte h = 2;
    public eygr c = emptyProtobufList();
    public String d = "";
    public int f = 3;

    static {
        ezhv ezhvVar = new ezhv();
        a = ezhvVar;
        eyfy.registerDefaultInstance(ezhv.class, ezhvVar);
    }

    private ezhv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဈ\u0000\u0003ᐉ\u0001\u0004᠌\u0002", new Object[]{"b", "c", ezhu.class, "d", "e", "f", eziy.a});
            case NEW_MUTABLE_INSTANCE:
                return new ezhv();
            case NEW_BUILDER:
                return new ezhs();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhv.class) {
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
