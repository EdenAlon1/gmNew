package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erho extends eyfy implements eyht {
    public static final erho a;
    private static volatile eyhz d;
    public int b;
    public long c;
    private int e;
    private int f;
    private byte g = 2;

    static {
        erho erhoVar = new erho();
        a = erhoVar;
        eyfy.registerDefaultInstance(erho.class, erhoVar);
    }

    private erho() {
    }

    public static /* synthetic */ void a(erho erhoVar) {
        erhoVar.b |= 4;
        erhoVar.f = 0;
    }

    public static /* synthetic */ void b(erho erhoVar) {
        erhoVar.b |= 2;
        erhoVar.e = 0;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new erho();
            case NEW_BUILDER:
                return new erhn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (erho.class) {
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
