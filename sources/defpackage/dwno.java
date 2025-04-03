package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwno extends eyft implements eyfu {
    public static final dwno a;
    private static volatile eyhz j;
    public int b;
    public long e;
    public long f;
    public eydq g;
    public boolean h;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        dwno dwnoVar = new dwno();
        a = dwnoVar;
        eyfy.registerDefaultInstance(dwno.class, dwnoVar);
    }

    private dwno() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new dwno();
            case NEW_BUILDER:
                return new dwnn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dwno.class) {
                    eyhzVar = j;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        j = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
