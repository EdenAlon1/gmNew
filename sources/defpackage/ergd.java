package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergd extends eyfy implements eyht {
    public static final ergd a;
    private static volatile eyhz d;
    public int b;
    public erfx c;
    private erfn e;
    private byte f = 2;

    static {
        ergd ergdVar = new ergd();
        a = ergdVar;
        eyfy.registerDefaultInstance(ergd.class, ergdVar);
    }

    private ergd() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ergd();
            case NEW_BUILDER:
                return new ergc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ergd.class) {
                    eyhzVar = d;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        d = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
