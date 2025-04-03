package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epoa extends eyft implements eyfu {
    public static final epoa a;
    private static volatile eyhz l;
    public int b;
    public int c;
    public int g;
    public ezkf h;
    public int i;
    public epmn k;
    private byte m = 2;
    public int d = -1;
    public eygi e = emptyIntList();
    public String f = "";
    public int j = -1;

    static {
        epoa epoaVar = new epoa();
        a = epoaVar;
        eyfy.registerDefaultInstance(epoa.class, epoaVar);
    }

    private epoa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"b", "c", "d", "e", "f", "i", epny.a, "g", "h", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new epoa();
            case NEW_BUILDER:
                return new epnx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = l;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epoa.class) {
                    eyhzVar = l;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        l = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
