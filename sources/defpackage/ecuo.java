package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecuo extends eyfy implements eyht {
    public static final ecuo a;
    private static volatile eyhz l;
    public int b;
    public fglq c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public fgmh j;
    public int k;
    private byte m = 2;
    public String i = "";

    static {
        ecuo ecuoVar = new ecuo();
        a = ecuoVar;
        eyfy.registerDefaultInstance(ecuo.class, ecuoVar);
    }

    private ecuo() {
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
                return newMessageInfo(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ecuo();
            case NEW_BUILDER:
                return new ecun();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ecuo.class) {
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
