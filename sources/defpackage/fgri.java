package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgri extends eyfy implements eyht {
    public static final fgri a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public fgrg e;
    public int c = 0;
    private byte g = 2;

    static {
        fgri fgriVar = new fgri();
        a = fgriVar;
        eyfy.registerDefaultInstance(fgri.class, fgriVar);
    }

    private fgri() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", fgom.class, "e", fgrq.class});
            case NEW_MUTABLE_INSTANCE:
                return new fgri();
            case NEW_BUILDER:
                return new fgrh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = f;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgri.class) {
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
