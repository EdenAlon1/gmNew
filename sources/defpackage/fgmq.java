package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmq extends eyft implements eyfu {
    public static final fgmq a;
    private static volatile eyhz h;
    public int b;
    public fgmn c;
    public fgpb d;
    public int e;
    public fgml f;
    private byte i = 2;
    public String g = "";

    static {
        fgmq fgmqVar = new fgmq();
        a = fgmqVar;
        eyfy.registerDefaultInstance(fgmq.class, fgmqVar);
    }

    private fgmq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", fgmp.a, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new fgmq();
            case NEW_BUILDER:
                return new fgmo();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = h;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgmq.class) {
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
