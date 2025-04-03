package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqi extends eyfy implements eyht {
    public static final faqi a;
    private static volatile eyhz c;
    private int d;
    private byte h = 2;
    private String e = "";
    private String f = "";
    private String g = "";
    public eygr b = emptyProtobufList();

    static {
        faqi faqiVar = new faqi();
        a = faqiVar;
        eyfy.registerDefaultInstance(faqi.class, faqiVar);
    }

    private faqi() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0001\u0004\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006Л", new Object[]{"d", "e", "f", "g", "b", faqg.class});
            case NEW_MUTABLE_INSTANCE:
                return new faqi();
            case NEW_BUILDER:
                return new faqh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faqi.class) {
                    eyhzVar = c;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        c = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
