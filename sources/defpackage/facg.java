package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class facg extends eyfy implements eyht {
    public static final facg a;
    private static volatile eyhz f;
    public eygr b;
    public eyhm c = eyhm.a;
    public eyhm d;
    public eyhm e;
    private byte g;

    static {
        facg facgVar = new facg();
        a = facgVar;
        eyfy.registerDefaultInstance(facg.class, facgVar);
    }

    private facg() {
        eyhm eyhmVar = eyhm.a;
        this.d = eyhmVar;
        this.e = eyhmVar;
        this.g = (byte) 2;
        this.b = emptyProtobufList();
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0006\u0004\u0003\u0001\u0002\u0001\u001b\u0002в\u00032\u0006в", new Object[]{"b", faci.class, "c", facd.a, "e", facf.a, "d", face.a});
            case NEW_MUTABLE_INSTANCE:
                return new facg();
            case NEW_BUILDER:
                return new facc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (facg.class) {
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
