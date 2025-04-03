package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgmh extends eyft<fgmh, fgmg> implements eyfu {
    public static final fgmh a;
    private static volatile eyhz b;
    private byte c = 2;

    static {
        fgmh fgmhVar = new fgmh();
        a = fgmhVar;
        eyfy.registerDefaultInstance(fgmh.class, fgmhVar);
    }

    private fgmh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new fgmh();
            case NEW_BUILDER:
                return new fgmg();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = b;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgmh.class) {
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
