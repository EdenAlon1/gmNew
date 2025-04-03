package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figw extends eyfy<figw, figu> implements eyht {
    public static final figw DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile eyhz<figw> PARSER;
    public eyhm<String, figt> flags_ = eyhm.a;

    static {
        figw figwVar = new figw();
        DEFAULT_INSTANCE = figwVar;
        eyfy.registerDefaultInstance(figw.class, figwVar);
    }

    private figw() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", figv.a});
            case NEW_MUTABLE_INSTANCE:
                return new figw();
            case NEW_BUILDER:
                return new figu();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                eyhz<figw> eyhzVar2 = PARSER;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (figw.class) {
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
