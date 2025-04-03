package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exjy extends eyfy implements eyht {
    public static final exjy a;
    private static volatile eyhz c;
    private Object d;
    public int b = 0;
    private byte e = 2;

    static {
        exjy exjyVar = new exjy();
        a = exjyVar;
        eyfy.registerDefaultInstance(exjy.class, exjyVar);
    }

    private exjy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0007\u0001м\u0000\u0002м\u0000\u0003м\u0000\u0004м\u0000\u0005м\u0000\u0006м\u0000\u0007м\u0000", new Object[]{"d", "b", exjv.class, exka.class, exki.class, exke.class, exkk.class, exkc.class, exkg.class});
            case NEW_MUTABLE_INSTANCE:
                return new exjy();
            case NEW_BUILDER:
                return new exjw();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = c;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (exjy.class) {
                    eyhzVar = c;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        c = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
