package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxk extends eyfy implements eyht {
    public static final esxk a;
    private static volatile eyhz k;
    public eyja d;
    public eyja e;
    public eyja f;
    public long g;
    public ezhm h;
    public String i;
    public String j;
    private int l;
    private byte m = 2;
    public String b = "";
    public String c = "";

    static {
        esxk esxkVar = new esxk();
        a = esxkVar;
        eyfy.registerDefaultInstance(esxk.class, esxkVar);
    }

    private esxk() {
        eyee eyeeVar = eyee.b;
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\r\t\u0000\u0000\u0001\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0006\u0002\bᐉ\u0003\u000bȈ\fȈ\rဉ\u0002", new Object[]{"l", "b", "c", "d", "e", "g", "h", "i", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new esxk();
            case NEW_BUILDER:
                return new esxj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = k;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (esxk.class) {
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
