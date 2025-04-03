package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fape extends eyft implements eyfu {
    public static final fape a;
    private static volatile eyhz e;
    public int b;
    public fapd c;
    public eyev d;
    private byte f = 2;

    static {
        fape fapeVar = new fape();
        a = fapeVar;
        eyfy.registerDefaultInstance(fape.class, fapeVar);
    }

    private fape() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0006ဉ\u0001", new Object[]{"b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new fape();
            case NEW_BUILDER:
                return new fapb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fape.class) {
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
