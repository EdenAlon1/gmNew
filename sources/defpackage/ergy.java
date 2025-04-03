package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergy extends eyfy implements eyht {
    public static final ergy a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public ergl f;
    public ergd g;
    public erhb h;
    public erhe i;
    public ergl j;
    private erhg l;
    private ergn m;
    private ergb n;
    private byte o = 2;
    public String d = "";
    public String e = "";

    static {
        ergy ergyVar = new ergy();
        a = ergyVar;
        eyfy.registerDefaultInstance(ergy.class, ergyVar);
    }

    private ergy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"b", "c", ergx.a, "d", "e", "l", "m", "n", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ergy();
            case NEW_BUILDER:
                return new ergw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ergy.class) {
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
