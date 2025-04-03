package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgt extends eyfy implements eyht {
    public static final cvgt a;
    private static volatile eyhz q;
    public int b;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public cvhh l;
    public eyja m;
    public int o;
    public cmrf p;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String k = "";
    public eygr n = emptyProtobufList();

    static {
        cvgt cvgtVar = new cvgt();
        a = cvgtVar;
        eyfy.registerDefaultInstance(cvgt.class, cvgtVar);
    }

    private cvgt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0004\tȈ\nဉ\u0000\u000bဉ\u0001\f\u001b\r\u0004\u000eဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", cvhd.class, "o", "p"});
        }
        if (ordinal == 3) {
            return new cvgt();
        }
        if (ordinal == 4) {
            return new cvgs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = q;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvgt.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
