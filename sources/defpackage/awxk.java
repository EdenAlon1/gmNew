package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awxk extends eyfy implements eyht {
    public static final eygj a = new awxg();
    public static final awxk b;
    private static volatile eyhz t;
    public int c;
    public awui d;
    public azee f;
    public awui g;
    public azjw i;
    public awui j;
    public azvx k;
    public fayv n;
    public eyja p;
    public eopq q;
    public axad r;
    private byte u = 2;
    public String e = "";
    public String h = "";
    public String l = "";
    public String m = "";
    public eygr o = emptyProtobufList();
    public eygi s = emptyIntList();

    static {
        awxk awxkVar = new awxk();
        b = awxkVar;
        eyfy.registerDefaultInstance(awxk.class, awxkVar);
    }

    private awxk() {
    }

    public final void a() {
        eygr eygrVar = this.o;
        if (eygrVar.c()) {
            return;
        }
        this.o = eyfy.mutableCopy(eygrVar);
    }

    public final void b() {
        eygi eygiVar = this.s;
        if (eygiVar.c()) {
            return;
        }
        this.s = eyfy.mutableCopy(eygiVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0001\u0001ဉ\u0000\u0002ဉ\u0003\u0003ဈ\b\u0004ဈ\t\u0005ဉ\n\u0006\u001b\u0007ဉ\u000b\bᐉ\f\tဉ\r\nࠬ\u000bဉ\u0006\fဈ\u0001\rဈ\u0004\u000eဉ\u0002\u000fဉ\u0005\u0010ဉ\u0007", new Object[]{"c", "d", "g", "l", "m", "n", "o", awul.class, "p", "q", "r", "s", awxi.a, "j", "e", "h", "f", "i", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new awxk();
            case NEW_BUILDER:
                return new awxh();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                eyhz eyhzVar2 = t;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (awxk.class) {
                    eyhzVar = t;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(b);
                        t = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
