package defpackage;

import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eotf extends eyfy implements eyht {
    public static final eotf a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public ScytaleLoggingProto$ScytaleEvent d;
    public int e;
    private byte g = 2;

    static {
        eotf eotfVar = new eotf();
        a = eotfVar;
        eyfy.registerDefaultInstance(eotf.class, eotfVar);
    }

    private eotf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002ᔉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", eotd.a, "d", "e", eovv.a});
            case NEW_MUTABLE_INSTANCE:
                return new eotf();
            case NEW_BUILDER:
                return new eotc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eotf.class) {
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
