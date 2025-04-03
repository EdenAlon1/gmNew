package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqn extends eyfy implements eyht {
    public static final faqn a;
    private static volatile eyhz e;
    public float d;
    private int f;
    private byte g = 2;
    public String b = "";
    public eygr c = emptyProtobufList();

    static {
        faqn faqnVar = new faqn();
        a = faqnVar;
        eyfy.registerDefaultInstance(faqn.class, faqnVar);
    }

    private faqn() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0002\u0002ᔈ\u0001\u0003Л\u0004ခ\u0002", new Object[]{"f", "b", "c", faql.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new faqn();
            case NEW_BUILDER:
                return new faqm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faqn.class) {
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
