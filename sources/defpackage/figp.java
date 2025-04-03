package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figp extends eyfy<figp, figk> implements eyht {
    public static final figp DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile eyhz<figp> PARSER;
    public eyhm<String, fign> featureStates_ = eyhm.a;

    static {
        figp figpVar = new figp();
        DEFAULT_INSTANCE = figpVar;
        eyfy.registerDefaultInstance(figp.class, figpVar);
    }

    private figp() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", figo.a});
            case NEW_MUTABLE_INSTANCE:
                return new figp();
            case NEW_BUILDER:
                return new figk();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                eyhz<figp> eyhzVar2 = PARSER;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (figp.class) {
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
