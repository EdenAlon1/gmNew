package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etez extends eyfy implements eyht {
    public static final etez a;
    private static volatile eyhz z;
    public int b;
    public int e;
    public int f;
    public eted h;
    public boolean j;
    public eyev k;
    public eyja n;
    public boolean o;
    public boolean p;
    public int q;
    public long v;
    public eyhm c = eyhm.a;
    public eyhm y = eyhm.a;
    public eygr d = emptyProtobufList();
    public String g = "";
    public eygr i = emptyProtobufList();
    public String l = "";
    public String m = "";
    public eyee r = eyee.b;
    public String s = "";
    public String t = "";
    public String u = "";
    public eygr w = emptyProtobufList();
    public eygr x = emptyProtobufList();

    static {
        etez etezVar = new etez();
        a = etezVar;
        eyfy.registerDefaultInstance(etez.class, etezVar);
    }

    private etez() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0017\u0000\u0001\u0001\u0018\u0017\u0002\u0004\u0000\u00012\u0002\u001c\u0003\u0004\u0004\u0004\u0005Ȉ\u0006ဉ\u0000\u0007\u001b\b\u0007\nဉ\u0001\u000bȈ\fȈ\rဉ\u0002\u000e\u0007\u000f\u0007\u0010\f\u0011\n\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015\u0002\u0016\u001b\u0017\u001b\u00182", new Object[]{"b", "c", eteu.a, "d", "e", "f", "g", "h", "i", etef.class, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", eyja.class, "x", eyja.class, "y", etet.a});
        }
        if (ordinal == 3) {
            return new etez();
        }
        if (ordinal == 4) {
            return new eteo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = z;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (etez.class) {
            eyhzVar = z;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                z = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
