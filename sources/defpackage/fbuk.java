package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbuk extends eyfy implements fbul {
    public static final fbuk a;
    private static volatile eyhz j;
    public int b;
    public Object d;
    public int e;
    public int g;
    public int h;
    public int i;
    public int c = 0;
    private byte k = 2;
    public String f = "";

    static {
        fbuk fbukVar = new fbuk();
        a = fbukVar;
        eyfy.registerDefaultInstance(fbuk.class, fbukVar);
    }

    private fbuk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0016\u0001\u0001\u0001\u0016\u0016\u0000\u0000\u0002\u0001\f\u0002<\u0000\u0003\u0004\u0004\u0004\u0005м\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nм\u0000\u000b<\u0000\fȈ\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014ဌ\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"d", "c", "b", "e", fbva.class, "h", "i", emcl.class, fbsk.class, fbrx.class, fbue.class, fbxy.class, fbrz.class, fbuu.class, "f", fbwt.class, fbtf.class, fbxu.class, fbuw.class, fbya.class, fbtj.class, fbvh.class, "g", fbty.class, fbui.class});
            case NEW_MUTABLE_INSTANCE:
                return new fbuk();
            case NEW_BUILDER:
                return new fbuj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = j;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (fbuk.class) {
                    eyhzVar = j;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        j = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
