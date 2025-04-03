package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digs extends eyfy implements eyht {
    public static final digs a;
    private static volatile eyhz c;
    private byte d = 2;
    public eygr b = emptyProtobufList();

    static {
        digs digsVar = new digs();
        a = digsVar;
        eyfy.registerDefaultInstance(digs.class, digsVar);
    }

    private digs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", digr.class});
            case NEW_MUTABLE_INSTANCE:
                return new digs();
            case NEW_BUILDER:
                return new digj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (digs.class) {
                    eyhzVar = c;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        c = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
