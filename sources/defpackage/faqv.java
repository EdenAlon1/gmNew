package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqv extends eyft implements eyfu {
    public static final faqv a;
    private static volatile eyhz d;
    public farq c;
    private int e;
    private fara f;
    private faro g;
    private byte h = 2;
    public eygr b = eyfy.emptyProtobufList();

    static {
        faqv faqvVar = new faqv();
        a = faqvVar;
        eyfy.registerDefaultInstance(faqv.class, faqvVar);
    }

    private faqv() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0001\u0000\u0001\u001a\u0004ဉ\u0005\u0007ဉ\u0007\rဉ\u0004", new Object[]{"e", "b", "g", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new faqv();
            case NEW_BUILDER:
                return new faqu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faqv.class) {
                    eyhzVar = d;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        d = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
