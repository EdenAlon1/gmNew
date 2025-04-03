package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervk extends eyfy implements eyht {
    public static final ervk a;
    private static volatile eyhz l;
    public int d;
    public boolean e;
    public long f;
    public int g;
    public eyee h;
    public eyee i;
    public boolean j;
    public eyee k;
    private byte m = 2;
    public String b = "";
    public eyee c = eyee.b;

    static {
        ervk ervkVar = new ervk();
        a = ervkVar;
        eyfy.registerDefaultInstance(ervk.class, ervkVar);
    }

    private ervk() {
        eyee eyeeVar = eyee.b;
        this.h = eyeeVar;
        this.i = eyeeVar;
        this.k = eyeeVar;
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
                return newMessageInfo(a, "\u0004\n\u0000\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001Ȉ\u0003\u0002\u0004\f\u0005\n\u0006\u0007\u0007\u0004\b\n\t\u0007\n\n\u000b\n", new Object[]{"b", "f", "g", "h", "e", "d", "i", "j", "c", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ervk();
            case NEW_BUILDER:
                return new ervj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ervk.class) {
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
