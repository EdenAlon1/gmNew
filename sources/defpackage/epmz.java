package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epmz extends eyfy implements eyht {
    public static final epmz a;
    private static volatile eyhz e;
    public int b;
    public ergj d;
    private erfj f;
    private byte g = 2;
    public int c = 1;

    static {
        epmz epmzVar = new epmz();
        a = epmzVar;
        eyfy.registerDefaultInstance(epmz.class, epmzVar);
    }

    private epmz() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", epmy.a, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new epmz();
            case NEW_BUILDER:
                return new epmx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epmz.class) {
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
