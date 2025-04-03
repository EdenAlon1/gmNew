package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecec extends eyfy implements eyht {
    public static final ecec a;
    private static volatile eyhz d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ecec ececVar = new ecec();
        a = ececVar;
        eyfy.registerDefaultInstance(ecec.class, ececVar);
    }

    private ecec() {
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
                return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", fgmh.class, ecee.class, ecei.class, ecek.class});
            case NEW_MUTABLE_INSTANCE:
                return new ecec();
            case NEW_BUILDER:
                return new eceb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ecec.class) {
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
