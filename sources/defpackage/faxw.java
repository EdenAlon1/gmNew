package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxw extends eyft implements eyfu {
    public static final faxw a;
    private static volatile eyhz f;
    public int b;
    public ezwp c;
    public int d;
    public ewat e;
    private byte g = 2;

    static {
        faxw faxwVar = new faxw();
        a = faxwVar;
        eyfy.registerDefaultInstance(faxw.class, faxwVar);
    }

    private faxw() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", faxu.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new faxw();
            case NEW_BUILDER:
                return new faxt();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faxw.class) {
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
