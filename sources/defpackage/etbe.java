package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbe extends eyfy implements eyht {
    public static final etbe a;
    private static volatile eyhz f;
    public int b;
    public etau c;
    public esxk d;
    public eyfh e;
    private eymu g;
    private byte h = 2;

    static {
        etbe etbeVar = new etbe();
        a = etbeVar;
        eyfy.registerDefaultInstance(etbe.class, etbeVar);
    }

    private etbe() {
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
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဉ\u0003ϧဉ\u0000", new Object[]{"b", "d", "g", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new etbe();
            case NEW_BUILDER:
                return new etbd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (etbe.class) {
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
