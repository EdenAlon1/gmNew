package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezhc extends eyfy implements eyht {
    public static final ezhc a;
    private static volatile eyhz b;
    private int c;
    private long e;
    private long f;
    private ezha g;
    private ezha h;
    private byte i = 2;
    private String d = "";

    static {
        ezhc ezhcVar = new ezhc();
        a = ezhcVar;
        eyfy.registerDefaultInstance(ezhc.class, ezhcVar);
    }

    private ezhc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔈ\u0000\u0002ᔂ\u0001\u0003ᔂ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ezhc();
            case NEW_BUILDER:
                return new ezhb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezhc.class) {
                    eyhzVar = b;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        b = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
