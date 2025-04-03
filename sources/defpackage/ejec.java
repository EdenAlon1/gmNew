package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejec extends eyfy implements eyht {
    public static final ejec a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eixz d;
    public int e;
    private byte g = 2;

    static {
        ejec ejecVar = new ejec();
        a = ejecVar;
        eyfy.registerDefaultInstance(ejec.class, ejecVar);
    }

    private ejec() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", eizb.a});
            case NEW_MUTABLE_INSTANCE:
                return new ejec();
            case NEW_BUILDER:
                return new ejeb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ejec.class) {
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
