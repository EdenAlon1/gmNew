package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpu extends eyfy implements eyht {
    public static final fgpu a;
    private static volatile eyhz m;
    public int b;
    public boolean c;
    public fgpb d;
    public int g;
    public eria i;
    public ezog j;
    public fgpy k;
    public fgps l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        fgpu fgpuVar = new fgpu();
        a = fgpuVar;
        eyfy.registerDefaultInstance(fgpu.class, fgpuVar);
    }

    private fgpu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", fgpt.a, "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new fgpu();
            case NEW_BUILDER:
                return new fgpo();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = m;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fgpu.class) {
                    eyhzVar = m;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        m = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
