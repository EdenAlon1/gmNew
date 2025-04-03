package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnc extends eyfy implements eyht {
    public static final fgnc a;
    private static volatile eyhz d;
    private byte e = 2;
    public eygr b = emptyProtobufList();
    public eygr c = emptyProtobufList();

    static {
        fgnc fgncVar = new fgnc();
        a = fgncVar;
        eyfy.registerDefaultInstance(fgnc.class, fgncVar);
    }

    private fgnc() {
    }

    public final void a() {
        eygr eygrVar = this.b;
        if (eygrVar.c()) {
            return;
        }
        this.b = eyfy.mutableCopy(eygrVar);
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", fgna.class, "c", fgnl.class});
            case NEW_MUTABLE_INSTANCE:
                return new fgnc();
            case NEW_BUILDER:
                return new fgnb();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = d;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgnc.class) {
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
