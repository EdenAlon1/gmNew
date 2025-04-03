package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eopv extends eyfy implements eyht {
    public static final eopv a;
    private static volatile eyhz c;
    private byte d = 2;
    public eygr b = emptyProtobufList();

    static {
        eopv eopvVar = new eopv();
        a = eopvVar;
        eyfy.registerDefaultInstance(eopv.class, eopvVar);
    }

    private eopv() {
    }

    public final void a() {
        eygr eygrVar = this.b;
        if (eygrVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", eohl.class});
            case NEW_MUTABLE_INSTANCE:
                return new eopv();
            case NEW_BUILDER:
                return new eopu();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eopv.class) {
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
