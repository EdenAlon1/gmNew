package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezmk extends eyfy implements eyht {
    public static final ezmk a;
    private static volatile eyhz k;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ezmg i;
    public boolean j;
    public int c = 0;
    private byte l = 2;

    static {
        ezmk ezmkVar = new ezmk();
        a = ezmkVar;
        eyfy.registerDefaultInstance(ezmk.class, ezmkVar);
    }

    private ezmk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0014\u0001\u0001\u0002\u0017\u0014\u0000\u0000\u0001\u0002\f\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n\f\u000b<\u0000\f<\u0000\r<\u0000\u000e\f\u000f\u0004\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013ဉ\u0000\u0015ဇ\u0001\u0017м\u0000", new Object[]{"d", "c", "b", "e", ezma.class, ezmc.class, ezmu.class, ezmq.class, ezmw.class, ezlf.class, ezld.class, "f", ezme.class, ezmm.class, ezna.class, "g", "h", ezla.class, ezmo.class, ezlw.class, "i", "j", ezms.class});
            case NEW_MUTABLE_INSTANCE:
                return new ezmk();
            case NEW_BUILDER:
                return new ezmh();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (ezmk.class) {
                    eyhzVar = k;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        k = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
