package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgf extends eyfy implements eyht {
    public static final epgf a;
    private static volatile eyhz s;
    public int b;
    public epeq c;
    public epdt d;
    public epfe e;
    public epei f;
    public epge g;
    public epfz h;
    public epfj i;
    public boolean l;
    public epfp m;
    public epex n;
    public epfu o;
    public epeu p;
    public long q;
    public epes r;
    private byte t = 2;
    public String j = "";
    public String k = "";

    static {
        epgf epgfVar = new epgf();
        a = epgfVar;
        eyfy.registerDefaultInstance(epgf.class, epgfVar);
    }

    private epgf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0007\u0003ᐉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဈ\b\bဉ\u0005\tဉ\u0006\nဇ\t\fဉ\u000b\rဉ\f\u0010ဉ\u000f\u0011ဉ\u0010\u0013ဂ\u0012\u0014ဉ\u0013", new Object[]{"b", "c", "j", "d", "e", "f", "g", "k", "h", "i", "l", "m", "n", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new epgf();
            case NEW_BUILDER:
                return new epdx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = s;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epgf.class) {
                    eyhzVar = s;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        s = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
