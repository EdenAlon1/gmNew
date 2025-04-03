package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awzd extends eyfy implements eyht {
    public static final awzd a;
    private static volatile eyhz i;
    public int b;
    public awud c;
    public eyja e;
    public boolean f;
    public awyp g;
    public eopq h;
    private byte j = 2;
    public eyee d = eyee.b;

    static {
        awzd awzdVar = new awzd();
        a = awzdVar;
        eyfy.registerDefaultInstance(awzd.class, awzdVar);
    }

    private awzd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\nᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awzd();
            case NEW_BUILDER:
                return new awzc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = i;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (awzd.class) {
                    eyhzVar = i;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        i = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
