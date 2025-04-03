package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cesa extends eyfy implements eyht {
    public static final cesa a;
    private static volatile eyhz e;
    public int b;
    public int d;
    private byte f = 2;
    public String c = "";

    static {
        cesa cesaVar = new cesa();
        a = cesaVar;
        eyfy.registerDefaultInstance(cesa.class, cesaVar);
    }

    private cesa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᴌ\u0001", new Object[]{"b", "c", "d", eomz.a});
            case NEW_MUTABLE_INSTANCE:
                return new cesa();
            case NEW_BUILDER:
                return new cerz();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (cesa.class) {
                    eyhzVar = e;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        e = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
