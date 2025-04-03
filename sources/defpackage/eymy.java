package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eymy extends eyfy implements eyht {
    public static final eymy a;
    private static volatile eyhz e;
    public Object c;
    public int d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        eymy eymyVar = new eymy();
        a = eymyVar;
        eyfy.registerDefaultInstance(eymy.class, eymyVar);
    }

    private eymy() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001᠌\u0000\u0002м\u0000", new Object[]{"c", "b", "f", "d", ezia.a, eyna.class});
            case NEW_MUTABLE_INSTANCE:
                return new eymy();
            case NEW_BUILDER:
                return new eymx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eymy.class) {
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
