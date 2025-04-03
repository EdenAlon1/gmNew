package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplz extends eyfy implements eyht {
    public static final eplz a;
    public static final eyfw b;
    private static volatile eyhz d;
    private Object e;
    public int c = 0;
    private byte f = 2;

    static {
        eplz eplzVar = new eplz();
        a = eplzVar;
        eyfy.registerDefaultInstance(eplz.class, eplzVar);
        b = eyfy.newSingularGeneratedExtension(epoa.a, eplzVar, eplzVar, null, 772, eyjr.MESSAGE, eplz.class);
    }

    private eplz() {
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
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"e", "c", erhm.class, erhk.class});
            case NEW_MUTABLE_INSTANCE:
                return new eplz();
            case NEW_BUILDER:
                return new eply();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eplz.class) {
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
