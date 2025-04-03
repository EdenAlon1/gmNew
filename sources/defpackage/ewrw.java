package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewrw extends eyfy implements eyht {
    public static final ewrw a;
    private static volatile eyhz d;
    public fagm b;
    public eisi c;
    private int e;
    private byte f = 2;

    static {
        ewrw ewrwVar = new ewrw();
        a = ewrwVar;
        eyfy.registerDefaultInstance(ewrw.class, ewrwVar);
    }

    private ewrw() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0001\u0003ᐉ\u0001\u0005ဉ\u0000", new Object[]{"e", "c", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ewrw();
            case NEW_BUILDER:
                return new ewrv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ewrw.class) {
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
