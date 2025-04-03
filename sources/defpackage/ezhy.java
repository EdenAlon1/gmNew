package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhy extends eyfy implements eyht {
    public static final ezhy a;
    private static volatile eyhz f;
    public Object c;
    public int d;
    public ezjd e;
    private int g;
    public int b = 0;
    private byte h = 2;

    static {
        ezhy ezhyVar = new ezhy();
        a = ezhyVar;
        eyfy.registerDefaultInstance(ezhy.class, ezhyVar);
    }

    private ezhy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003᠌\u0000\u0004ဉ\u0001", new Object[]{"c", "b", "g", fagm.class, ezjb.class, "d", ezia.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ezhy();
            case NEW_BUILDER:
                return new ezhx();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhy.class) {
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
