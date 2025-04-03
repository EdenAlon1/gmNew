package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class faow extends eyfy implements eyht {
    public static final faow a;
    private static volatile eyhz g;
    public int b;
    public faou d;
    public fapa e;
    public faos f;
    private byte h = 2;
    public int c = 1;

    static {
        faow faowVar = new faow();
        a = faowVar;
        eyfy.registerDefaultInstance(faow.class, faowVar);
    }

    private faow() {
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
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᴌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", faox.a, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new faow();
            case NEW_BUILDER:
                return new faov();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (faow.class) {
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
