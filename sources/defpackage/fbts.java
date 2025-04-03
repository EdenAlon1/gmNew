package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbts extends eyfy implements eyht {
    public static final eygj a = new fbtq();
    public static final fbts b;
    private static volatile eyhz p;
    public int c;
    public fcfo d;
    public int e;
    public fbup f;
    public int h;
    public long l;
    public emrk n;
    public fbxe o;
    private byte q = 2;
    public String g = "";
    public String i = "";
    public String j = "";
    public eygi k = emptyIntList();
    public String m = "";

    static {
        fbts fbtsVar = new fbts();
        b = fbtsVar;
        eyfy.registerDefaultInstance(fbts.class, fbtsVar);
    }

    private fbts() {
    }

    public final void a() {
        eygi eygiVar = this.k;
        if (eygiVar.c()) {
            return;
        }
        this.k = eyfy.mutableCopy(eygiVar);
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
                return newMessageInfo(b, "\u0000\f\u0000\u0001\u0001\u000f\f\u0000\u0001\u0001\u0001ဉ\u0000\u0002\f\u0003ᐉ\u0001\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ\b,\f\u0002\rȈ\u000eဉ\u0004\u000fဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new fbts();
            case NEW_BUILDER:
                return new fbtr();
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                eyhz eyhzVar2 = p;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fbts.class) {
                    eyhzVar = p;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(b);
                        p = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
