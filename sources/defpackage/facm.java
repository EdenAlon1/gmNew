package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class facm extends eyfy implements eyht {
    public static final facm a;
    private static volatile eyhz d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        facm facmVar = new facm();
        a = facmVar;
        eyfy.registerDefaultInstance(facm.class, facmVar);
    }

    private facm() {
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
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001м\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"c", "b", fadn.class, facu.class, facs.class});
            case NEW_MUTABLE_INSTANCE:
                return new facm();
            case NEW_BUILDER:
                return new facl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (facm.class) {
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
