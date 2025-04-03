package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomb extends eyfy implements eyht {
    public static final eomb a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int e;
    private byte g = 2;
    public String d = "";

    static {
        eomb eombVar = new eomb();
        a = eombVar;
        eyfy.registerDefaultInstance(eomb.class, eombVar);
    }

    private eomb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", eolz.a, "d", "e", eoly.a});
            case NEW_MUTABLE_INSTANCE:
                return new eomb();
            case NEW_BUILDER:
                return new eoma();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eomb.class) {
                    eyhzVar = f;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        f = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
