package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fari extends eyft implements eyfu {
    public static final fari a;
    private static volatile eyhz d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        fari fariVar = new fari();
        a = fariVar;
        eyfy.registerDefaultInstance(fari.class, fariVar);
    }

    private fari() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0004м\u0000", new Object[]{"c", "b", faqv.class, farc.class, farg.class});
            case NEW_MUTABLE_INSTANCE:
                return new fari();
            case NEW_BUILDER:
                return new farh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fari.class) {
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
