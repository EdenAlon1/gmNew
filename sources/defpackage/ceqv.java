package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqv extends eyfy implements eyht {
    public static final ceqv a;
    private static volatile eyhz p;
    public int b;
    public int i;
    public boolean k;
    public int l;
    public int m;
    public long o;
    private byte q = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String n = "";

    static {
        ceqv ceqvVar = new ceqv();
        a = ceqvVar;
        eyfy.registerDefaultInstance(ceqv.class, ceqvVar);
    }

    private ceqv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\n\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006ᔈ\u0005\u0007ᔄ\u0006\bဈ\u0007\tᔇ\b\nᔄ\t\u000bᔄ\n\fဈ\u000b\rဂ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new ceqv();
            case NEW_BUILDER:
                return new cequ();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = p;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ceqv.class) {
                    eyhzVar = p;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        p = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
