package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqe extends eyfy implements eyht {
    public static final faqe a;
    private static volatile eyhz c;
    public faqi b;
    private int d;
    private faqc f;
    private byte g = 2;
    private String e = "";

    static {
        faqe faqeVar = new faqe();
        a = faqeVar;
        eyfy.registerDefaultInstance(faqe.class, faqeVar);
    }

    private faqe() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002", new Object[]{"d", "e", "b", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new faqe();
            case NEW_BUILDER:
                return new faqd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faqe.class) {
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
