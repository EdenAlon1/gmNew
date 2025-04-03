package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evrz extends eyfy implements eyht {
    public static final evrz a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public long d;
    public boolean f;
    public int i;
    private byte l = 2;
    public String e = "";
    public int g = 1;
    public String h = "";
    public String j = "";

    static {
        evrz evrzVar = new evrz();
        a = evrzVar;
        eyfy.registerDefaultInstance(evrz.class, evrzVar);
    }

    private evrz() {
    }

    public static /* synthetic */ void a(evrz evrzVar) {
        evrzVar.b |= 8;
        evrzVar.f = true;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", evrx.a, "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new evrz();
            case NEW_BUILDER:
                return new evrw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (evrz.class) {
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
