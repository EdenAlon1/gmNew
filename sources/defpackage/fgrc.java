package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrc extends eyfy implements eyht {
    public static final fgrc a;
    private static volatile eyhz f;
    public int b;
    public eyja d;
    public int e;
    private byte g = 2;
    public eygr c = emptyProtobufList();

    static {
        fgrc fgrcVar = new fgrc();
        a = fgrcVar;
        eyfy.registerDefaultInstance(fgrc.class, fgrcVar);
    }

    private fgrc() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new Object[]{"b", "c", fgri.class, "d", "e", fgrb.a});
            case NEW_MUTABLE_INSTANCE:
                return new fgrc();
            case NEW_BUILDER:
                return new fgra();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgrc.class) {
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
