package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqt extends eyfy implements eyht {
    public static final fgqt a;
    private static volatile eyhz e;
    public int b;
    public int c;
    private fgqr f;
    private byte g = 2;
    public int d = 1;

    static {
        fgqt fgqtVar = new fgqt();
        a = fgqtVar;
        eyfy.registerDefaultInstance(fgqt.class, fgqtVar);
    }

    private fgqt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", fgqs.a, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fgqt();
            case NEW_BUILDER:
                return new fgqp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgqt.class) {
                    eyhzVar = e;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        e = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
