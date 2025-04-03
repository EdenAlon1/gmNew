package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrg extends eyfy implements eyht {
    public static final fgrg a;
    private static volatile eyhz e;
    public int b;
    public eyev d;
    private boolean f;
    private byte g = 2;
    public eygr c = emptyProtobufList();

    static {
        fgrg fgrgVar = new fgrg();
        a = fgrgVar;
        eyfy.registerDefaultInstance(fgrg.class, fgrgVar);
    }

    private fgrg() {
    }

    public static /* synthetic */ void a(fgrg fgrgVar) {
        fgrgVar.b |= 2;
        fgrgVar.f = true;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", fgrf.class, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new fgrg();
            case NEW_BUILDER:
                return new fgrd();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = e;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgrg.class) {
                    eyhzVar = e;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        e = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
