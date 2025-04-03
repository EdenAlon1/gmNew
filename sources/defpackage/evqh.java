package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evqh extends eyfy implements eyht {
    public static final evqh a;
    private static volatile eyhz g;
    public int b;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public eygr e = eyfy.emptyProtobufList();
    public String f = "";

    static {
        evqh evqhVar = new evqh();
        a = evqhVar;
        eyfy.registerDefaultInstance(evqh.class, evqhVar);
    }

    private evqh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003\u001a\u0004ဈ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new evqh();
            case NEW_BUILDER:
                return new evqg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evqh.class) {
                    eyhzVar = g;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        g = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
