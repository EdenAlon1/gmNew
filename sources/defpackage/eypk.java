package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eypk extends eyfy implements eyht {
    public static final eypk a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public long e;
    public boolean f;
    public ezie g;
    public boolean h;
    public int i;
    private byte l = 2;
    public eygr d = eyfy.emptyProtobufList();
    public String j = "";

    static {
        eypk eypkVar = new eypk();
        a = eypkVar;
        eyfy.registerDefaultInstance(eypk.class, eypkVar);
    }

    private eypk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ဇ\u0004\u0007᠌\u0005\bဈ\u0006", new Object[]{"b", "c", ezia.a, "d", "e", "f", "g", "h", "i", eypt.a, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new eypk();
            case NEW_BUILDER:
                return new eypj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eypk.class) {
                    eyhzVar = k;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        k = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
