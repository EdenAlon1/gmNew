package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwre extends eyfy implements eyht {
    public static final dwre a;
    private static volatile eyhz d;
    public int b;
    public dwqb c;
    private byte e = 2;

    static {
        dwre dwreVar = new dwre();
        a = dwreVar;
        eyfy.registerDefaultInstance(dwre.class, dwreVar);
    }

    private dwre() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new dwre();
            case NEW_BUILDER:
                return new dwrd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (dwre.class) {
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
