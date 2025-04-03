package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecel extends eyfy implements eyht {
    public static final ecel a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public eyja d;
    private byte g = 2;
    public eygr e = emptyProtobufList();

    static {
        ecel ecelVar = new ecel();
        a = ecelVar;
        eyfy.registerDefaultInstance(ecel.class, ecelVar);
    }

    private ecel() {
    }

    public final void a() {
        eygr eygrVar = this.e;
        if (eygrVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", ecec.class});
            case NEW_MUTABLE_INSTANCE:
                return new ecel();
            case NEW_BUILDER:
                return new ecea();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ecel.class) {
                    eyhzVar = f;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        f = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
