package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezfo extends eyfy implements eyht {
    public static final ezfo a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public eyte e;
    public eysy f;
    public int c = 0;
    private byte h = 2;

    static {
        ezfo ezfoVar = new ezfo();
        a = ezfoVar;
        eyfy.registerDefaultInstance(ezfo.class, ezfoVar);
    }

    private ezfo() {
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
                return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\bဉ\u0002\tဉ\u0003\n<\u0000\u000bм\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", ezfm.class, eyxm.class, eyxo.class, eyqo.class, eyti.class, "e", "f", eysj.class, eyrp.class, eyqy.class, eyvv.class, eywv.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezfo();
            case NEW_BUILDER:
                return new ezfn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezfo.class) {
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
