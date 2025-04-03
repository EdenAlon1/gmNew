package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epnt extends eyfy implements eyht {
    public static final epnt a;
    public static final eyfw b;
    private static volatile eyhz e;
    public int c;
    public fape d;
    private byte f = 2;

    static {
        epnt epntVar = new epnt();
        a = epntVar;
        eyfy.registerDefaultInstance(epnt.class, epntVar);
        b = eyfy.newSingularGeneratedExtension(epmc.a, epntVar, epntVar, null, 120, eyjr.MESSAGE, epnt.class);
    }

    private epnt() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new epnt();
            case NEW_BUILDER:
                return new epns();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epnt.class) {
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
