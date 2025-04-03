package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class figs extends eyfy<figs, figr> implements eyht {
    public static final int APP_ID_FIELD_NUMBER = 1;
    public static final int BOOL_VALUE_FIELD_NUMBER = 3;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    public static final figs DEFAULT_INSTANCE;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
    public static final int INT_VALUE_FIELD_NUMBER = 4;
    public static final int MIN_VERSION_FIELD_NUMBER = 2;
    private static volatile eyhz<figs> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 6;
    public int bitField0_;
    public Object value_;
    public int valueCase_ = 0;
    public String appId_ = "";
    public String minVersion_ = "";

    static {
        figs figsVar = new figs();
        DEFAULT_INSTANCE = figsVar;
        eyfy.registerDefaultInstance(figs.class, figsVar);
    }

    private figs() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_"});
            case NEW_MUTABLE_INSTANCE:
                return new figs();
            case NEW_BUILDER:
                return new figr();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                eyhz<figs> eyhzVar2 = PARSER;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (figs.class) {
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
