package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblh extends eyfy implements eyht {
    public static final fblh a;
    private static volatile eyhz w;
    public int b;
    public Object d;
    public Object f;
    public Object h;
    public long j;
    public fbik k;
    public fbhy l;
    public int n;
    public boolean q;
    public fbgc r;
    public int s;
    public int t;
    public fblj u;
    public eyee v;
    public int c = 0;
    public int e = 0;
    public int g = 0;
    public eyhm o = eyhm.a;
    public String i = "";
    public String m = "";
    public String p = "";

    static {
        fblh fblhVar = new fblh();
        a = fblhVar;
        eyfy.registerDefaultInstance(fblh.class, fblhVar);
    }

    private fblh() {
        emptyIntList();
        this.v = eyee.b;
        eyfy.emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0017\u0003\u0001\u0001\u0097\u0017\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဉ\u0000\u0004ဉ\u0001\u0005<\u0000\tȈ\n\f\u000b2\fȈ\r\u0007\u000eဉ\u0004\u000f\f\u0010\f\u0011ဉ\u0005\u0013\ne<\u0001f<\u0001g<\u0001h<\u0001i<\u0001j<\u0001k<\u0001\u0097<\u0002", new Object[]{"d", "c", "f", "e", "h", "g", "b", "i", "j", "k", "l", fbik.class, "m", "n", "o", fblg.a, "p", "q", "r", "s", "t", "u", "v", fblc.class, fblt.class, fbll.class, fbky.class, fble.class, fbnn.class, fbmh.class, fbja.class});
        }
        if (ordinal == 3) {
            return new fblh();
        }
        if (ordinal == 4) {
            return new fblf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = w;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fblh.class) {
            eyhzVar = w;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                w = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
