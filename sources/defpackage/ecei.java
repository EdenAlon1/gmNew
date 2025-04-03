package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecei extends eyfy implements eyht {
    public static final ecei a;
    private static volatile eyhz f;
    public int b;
    public eyja d;
    public int e;
    private byte g = 2;
    public eygr c = emptyProtobufList();

    static {
        ecei eceiVar = new ecei();
        a = eceiVar;
        eyfy.registerDefaultInstance(ecei.class, eceiVar);
    }

    private ecei() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", fgri.class, "d", "e", eceg.a});
            case NEW_MUTABLE_INSTANCE:
                return new ecei();
            case NEW_BUILDER:
                return new ecef();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ecei.class) {
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
