package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgns extends eyft implements eyfu {
    public static final fgns a;
    private static volatile eyhz l;
    public int b;
    public long d;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte m = 2;
    public String c = "";
    public String e = "";

    static {
        fgns fgnsVar = new fgns();
        a = fgnsVar;
        eyfy.registerDefaultInstance(fgns.class, fgnsVar);
    }

    private fgns() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\u0007᠌\r\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", fgnr.a, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new fgns();
            case NEW_BUILDER:
                return new fgnq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgns.class) {
                    eyhzVar = l;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        l = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
