package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgp extends eyfy implements eyht {
    public static final cvgp a;
    private static volatile eyhz y;
    public int b;
    public eyja g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean p;
    public boolean q;
    public int r;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public String c = "";
    public String d = "";
    public eygr e = emptyProtobufList();
    public String f = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String s = "";
    public eygr x = emptyProtobufList();

    static {
        cvgp cvgpVar = new cvgp();
        a = cvgpVar;
        eyfy.registerDefaultInstance(cvgp.class, cvgpVar);
    }

    private cvgp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005ဉ\u0000\u0006\u0007\u0007\u0007\b\u0007\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0007\u000f\u0007\u0010\u0004\u0011Ȉ\u0012\u0004\u0013\u0004\u0014\u0004\u0015\u0007\u0016\u001b", new Object[]{"b", "c", "d", "e", cvhh.class, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", cvgt.class});
        }
        if (ordinal == 3) {
            return new cvgp();
        }
        if (ordinal == 4) {
            return new cvgo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = y;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvgp.class) {
            eyhzVar = y;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                y = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
