package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlok extends eyft implements eyfu {
    public static final dlok a;
    private static volatile eyhz c;
    public int b;
    private int d;
    private byte e = 2;

    static {
        dlok dlokVar = new dlok();
        a = dlokVar;
        eyfy.registerDefaultInstance(dlok.class, dlokVar);
    }

    private dlok() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", dloi.a});
            case NEW_MUTABLE_INSTANCE:
                return new dlok();
            case NEW_BUILDER:
                return new dloh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dlok.class) {
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
