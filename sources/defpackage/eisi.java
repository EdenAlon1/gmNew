package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eisi extends eyfy implements eyht {
    public static final eisi a;
    private static volatile eyhz j;
    public int b;
    public eiso d;
    public eygr i;
    private byte k = 2;
    public String c = "";
    public eygr e = emptyProtobufList();
    public String f = "";
    public eygr g = emptyProtobufList();
    public eygr h = emptyProtobufList();

    static {
        eisi eisiVar = new eisi();
        a = eisiVar;
        eyfy.registerDefaultInstance(eisi.class, eisiVar);
    }

    private eisi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u00012\u0007\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u001aဈ\u00020\u001b2\u001b", new Object[]{"b", "c", "d", "g", eisg.class, "h", eisq.class, "f", "e", eist.class, "i", eirz.class});
            case NEW_MUTABLE_INSTANCE:
                return new eisi();
            case NEW_BUILDER:
                return new eish();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eisi.class) {
                    eyhzVar = j;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        j = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
