package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figt extends eyfy<figt, figq> implements eyht {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    public static final figt DEFAULT_INSTANCE;
    private static volatile eyhz<figt> PARSER;
    public eygr<figs> constrainedValues_ = emptyProtobufList();

    static {
        figt figtVar = new figt();
        DEFAULT_INSTANCE = figtVar;
        eyfy.registerDefaultInstance(figt.class, figtVar);
    }

    private figt() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", figs.class});
            case NEW_MUTABLE_INSTANCE:
                return new figt();
            case NEW_BUILDER:
                return new figq();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                eyhz<figt> eyhzVar2 = PARSER;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (figt.class) {
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
