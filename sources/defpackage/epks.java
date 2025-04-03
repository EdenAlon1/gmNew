package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epks extends eyfy implements eyht {
    public static final epks a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    private byte h = 2;

    static {
        epks epksVar = new epks();
        a = epksVar;
        eyfy.registerDefaultInstance(epks.class, epksVar);
    }

    private epks() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᴌ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", epkr.a, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new epks();
            case NEW_BUILDER:
                return new epkq();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (epks.class) {
                    eyhzVar = g;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        g = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
