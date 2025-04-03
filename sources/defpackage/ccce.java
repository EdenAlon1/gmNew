package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccce extends eyfy implements eyht {
    public static final ccce a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int f;
    public boolean g;
    public int h;
    public eyja i;
    private byte l = 2;
    public String e = "";
    public String j = "";

    static {
        ccce ccceVar = new ccce();
        a = ccceVar;
        eyfy.registerDefaultInstance(ccce.class, ccceVar);
    }

    private ccce() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002\u0004င\u0003\u0005ᔇ\u0004\u0006င\u0005\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ccce();
            case NEW_BUILDER:
                return new cccd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ccce.class) {
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
