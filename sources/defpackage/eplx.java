package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eplx extends eyfy implements eyht {
    public static final eplx a;
    private static volatile eyhz o;
    public int b;
    public Object d;
    public Object f;
    public eplr g;
    public eplr h;
    public eyrc i;
    public int j;
    public int k;
    public eyrz n;
    public int c = 0;
    public int e = 0;
    private byte p = 2;
    public String l = "";
    public String m = "";

    static {
        eplx eplxVar = new eplx();
        a = eplxVar;
        eyfy.registerDefaultInstance(eplx.class, eplxVar);
    }

    private eplx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        switch (eyfxVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004#\u0002\u0001\u0002(#\u0000\u0000\u0001\u0002ဉ\u0001\u0003ဉ\u0002\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0001\n<\u0001\u000b<\u0001\f<\u0001\r<\u0001\u000e<\u0001\u000f<\u0001\u0010<\u0001\u0011<\u0001\u0012м\u0001\u0014<\u0001\u0015<\u0001\u0016<\u0001\u0017<\u0001\u0018ဉ\u0006\u0019<\u0001\u001a᠌\u0007\u001b᠌\b\u001c<\u0001\u001d<\u0001\u001eဈ\t\u001f<\u0001 <\u0001!<\u0001#ဈ\n$<\u0001%<\u0001&<\u0001'<\u0001(ဉ\u000b", new Object[]{"d", "c", "f", "e", "b", "g", "h", eysq.class, eyso.class, eysu.class, eytq.class, eyqc.class, eyxm.class, eysb.class, eyta.class, eyrh.class, eyqj.class, eysm.class, eytw.class, ezfo.class, ezfk.class, eypy.class, eyyf.class, eytu.class, "i", ezbn.class, "j", eplt.a, "k", eplv.a, eyra.class, eyqa.class, "l", eyts.class, eyqh.class, eyrf.class, "m", ezcs.class, eyyn.class, eyrx.class, fgki.class, "n"});
            case NEW_MUTABLE_INSTANCE:
                return new eplx();
            case NEW_BUILDER:
                return new epls();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                eyhz eyhzVar2 = o;
                if (eyhzVar2 != null) {
                    return eyhzVar2;
                }
                synchronized (eplx.class) {
                    eyhzVar = o;
                    if (eyhzVar == null) {
                        eyhzVar = new eyfr(a);
                        o = eyhzVar;
                    }
                }
                return eyhzVar;
            default:
                throw null;
        }
    }
}
