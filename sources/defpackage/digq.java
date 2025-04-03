package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digq extends eyfy implements eyht {
    public static final digq a;
    private static volatile eyhz e;
    public int b;
    public digp d;
    private byte f = 2;
    public int c = 1;

    static {
        digq digqVar = new digq();
        a = digqVar;
        eyfy.registerDefaultInstance(digq.class, digqVar);
    }

    private digq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", digm.a, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new digq();
            case NEW_BUILDER:
                return new digl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (digq.class) {
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
