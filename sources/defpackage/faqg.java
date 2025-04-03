package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqg extends eyfy implements eyht {
    public static final faqg a;
    private static volatile eyhz c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        faqg faqgVar = new faqg();
        a = faqgVar;
        eyfy.registerDefaultInstance(faqg.class, faqgVar);
    }

    private faqg() {
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new faqg();
            case NEW_BUILDER:
                return new faqf();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faqg.class) {
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
