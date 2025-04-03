package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faql extends eyfy implements eyht {
    public static final faql a;
    private static volatile eyhz d;
    private int e;
    private byte f = 2;
    public String b = "";
    public String c = "";

    static {
        faql faqlVar = new faql();
        a = faqlVar;
        eyfy.registerDefaultInstance(faql.class, faqlVar);
    }

    private faql() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001ᔈ\u0000\u0006ဈ\u0005", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new faql();
            case NEW_BUILDER:
                return new faqk();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faql.class) {
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
