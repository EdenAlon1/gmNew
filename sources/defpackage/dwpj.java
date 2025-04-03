package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwpj extends eyfy implements eyht {
    public static final dwpj a;
    private static volatile eyhz j;
    public int b;
    public int e;
    public eydq f;
    public long h;
    public String i;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public eygr g = emptyProtobufList();

    static {
        dwpj dwpjVar = new dwpj();
        a = dwpjVar;
        eyfy.registerDefaultInstance(dwpj.class, dwpjVar);
    }

    private dwpj() {
        emptyProtobufList();
        this.i = "";
        eyfy.emptyProtobufList();
    }

    public final void a() {
        eygr eygrVar = this.g;
        if (eygrVar.c()) {
            return;
        }
        this.g = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u001a\u0007\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0006ဈ\u0001\nင\u0002\u0014ဉ\u0003\u0017ဂ\u000f\u001aဈ\u0010", new Object[]{"b", "c", "g", dwph.class, "d", "e", "f", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new dwpj();
            case NEW_BUILDER:
                return new dwpi();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dwpj.class) {
                    eyhzVar = j;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        j = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
