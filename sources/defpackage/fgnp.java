package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnp extends eyfy implements eyht {
    public static final fgnp a;
    private static volatile eyhz g;
    public int b;
    public long c;
    public int d;
    public fgnz f;
    private byte h = 2;
    public eygr e = emptyProtobufList();

    static {
        fgnp fgnpVar = new fgnp();
        a = fgnpVar;
        eyfy.registerDefaultInstance(fgnp.class, fgnpVar);
    }

    private fgnp() {
    }

    public final void a() {
        eygr eygrVar = this.e;
        if (eygrVar.c()) {
            return;
        }
        this.e = eyfy.mutableCopy(eygrVar);
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", fgns.class, "d", fgno.a, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fgnp();
            case NEW_BUILDER:
                return new fgnn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = g;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgnp.class) {
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
