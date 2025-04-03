package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eria extends eyfy implements eyht {
    public static final eria a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public erhu e;
    public int c = 0;
    private byte h = 2;
    public eygr f = emptyProtobufList();

    static {
        eria eriaVar = new eria();
        a = eriaVar;
        eyfy.registerDefaultInstance(eria.class, eriaVar);
    }

    private eria() {
    }

    public final void a() {
        eygr eygrVar = this.f;
        if (eygrVar.c()) {
            return;
        }
        this.f = eyfy.mutableCopy(eygrVar);
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", erhu.class, erhx.class});
            case NEW_MUTABLE_INSTANCE:
                return new eria();
            case NEW_BUILDER:
                return new erhv();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eria.class) {
                    eyhzVar = g;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        g = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
