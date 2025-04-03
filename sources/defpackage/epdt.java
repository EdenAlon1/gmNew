package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epdt extends eyfy implements eyht {
    public static final epdt a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte k = 2;
    public eygr h = emptyProtobufList();
    public String i = "";

    static {
        epdt epdtVar = new epdt();
        a = epdtVar;
        eyfy.registerDefaultInstance(epdt.class, epdtVar);
    }

    private epdt() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0003\u0001ᴌ\u0000\u0002ᴌ\u0001\u0003᠌\u0002\u0004င\u0003\u0005ᴌ\u0004\b\u001b\tဈ\u0006", new Object[]{"b", "c", epdv.a, "d", epee.a, "e", epef.a, "f", "g", epdu.a, "h", epfa.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new epdt();
            case NEW_BUILDER:
                return new epds();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epdt.class) {
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
