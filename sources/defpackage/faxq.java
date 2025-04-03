package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxq extends eyft implements eyfu {
    public static final faxq a;
    private static volatile eyhz m;
    public int b;
    public long c;
    public long d;
    public int e;
    public eyee f;
    public long g;
    public eyee h;
    public boolean i;
    public String j;
    public double k;
    public faxw l;
    private byte n = 2;

    static {
        faxq faxqVar = new faxq();
        a = faxqVar;
        eyfy.registerDefaultInstance(faxq.class, faxqVar);
    }

    private faxq() {
        emptyProtobufList();
        eyee eyeeVar = eyee.b;
        eyee eyeeVar2 = eyee.b;
        this.f = eyeeVar2;
        this.g = 180000L;
        this.h = eyeeVar2;
        emptyIntList();
        emptyIntList();
        this.j = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001!\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new faxq();
            case NEW_BUILDER:
                return new faxp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = m;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faxq.class) {
                    eyhzVar = m;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        m = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
