package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fign extends eyfy<fign, figl> implements eyht {
    public static final fign DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile eyhz<fign> PARSER;
    public int bitField0_;
    public boolean enabled_;
    public eyhm<String, eyee> params_ = eyhm.a;

    static {
        fign fignVar = new fign();
        DEFAULT_INSTANCE = fignVar;
        eyfy.registerDefaultInstance(fign.class, fignVar);
    }

    private fign() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", figm.a});
            case NEW_MUTABLE_INSTANCE:
                return new fign();
            case NEW_BUILDER:
                return new figl();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                eyhz<fign> eyhzVar2 = PARSER;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fign.class) {
                    eyhzVar = PARSER;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(DEFAULT_INSTANCE);
                        PARSER = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
