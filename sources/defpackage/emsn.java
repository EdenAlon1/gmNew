package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emsn extends eyfy implements eyht {
    public static final emsn a;
    private static volatile eyhz e;
    public int b;
    public emsp c;
    private byte f = 2;
    public eygr d = emptyProtobufList();

    static {
        emsn emsnVar = new emsn();
        a = emsnVar;
        eyfy.registerDefaultInstance(emsn.class, emsnVar);
    }

    private emsn() {
    }

    public final void a() {
        eygr eygrVar = this.d;
        if (eygrVar.c()) {
            return;
        }
        this.d = eyfy.mutableCopy(eygrVar);
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", emrs.class});
            case NEW_MUTABLE_INSTANCE:
                return new emsn();
            case NEW_BUILDER:
                return new emsm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (emsn.class) {
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
