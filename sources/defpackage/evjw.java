package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjw extends eyfy implements eyht {
    public static final evjw a;
    private static volatile eyhz d;
    public int b;
    public int c;
    private int e;
    private byte f = 2;

    static {
        evjw evjwVar = new evjw();
        a = evjwVar;
        eyfy.registerDefaultInstance(evjw.class, evjwVar);
    }

    private evjw() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new evjw();
            case NEW_BUILDER:
                return new evjv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evjw.class) {
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
