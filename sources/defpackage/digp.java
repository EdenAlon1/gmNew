package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class digp extends eyfy implements eyht {
    public static final digp a;
    private static volatile eyhz q;
    public int b;
    public double e;
    public float f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public long p;
    private byte r = 2;
    public eyee c = eyee.b;
    public String d = "";
    public eygr k = emptyProtobufList();
    public eygr l = emptyProtobufList();
    public eygr m = eyfy.emptyProtobufList();
    public eygl n = emptyLongList();
    public eygh o = emptyFloatList();

    static {
        digp digpVar = new digp();
        a = digpVar;
        eyfy.registerDefaultInstance(digp.class, digpVar);
    }

    private digp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", digr.class, "l", digq.class, "m", "n", "p", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new digp();
            case NEW_BUILDER:
                return new digo();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = q;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (digp.class) {
                    eyhzVar = q;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        q = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
