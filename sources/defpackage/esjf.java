package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjf extends eyfy implements eyht {
    public static final esjf a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public fbuk d;
    private byte f = 2;

    static {
        esjf esjfVar = new esjf();
        a = esjfVar;
        eyfy.registerDefaultInstance(esjf.class, esjfVar);
    }

    private esjf() {
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
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0002ᐉ\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new esjf();
            case NEW_BUILDER:
                return new esje();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (esjf.class) {
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
