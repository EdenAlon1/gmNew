package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epms extends eyft implements eyfu {
    public static final epms a;
    private static volatile eyhz h;
    public int b;
    public epmw c;
    public int d;
    public epmw e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        epms epmsVar = new epms();
        a = epmsVar;
        eyfy.registerDefaultInstance(epms.class, epmsVar);
    }

    private epms() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", epmr.a, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new epms();
            case NEW_BUILDER:
                return new epmq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epms.class) {
                    eyhzVar = h;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        h = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
