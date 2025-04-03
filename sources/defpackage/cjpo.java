package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpo extends eyfy implements eyht {
    public static final cjpo a;
    private static volatile eyhz p;
    public int b;
    public long c;
    public int e;
    public boolean f;
    public int h;
    public boolean k;
    public eyja m;
    public int n;
    public String d = "";
    public String g = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String o = "";

    static {
        cjpo cjpoVar = new cjpo();
        a = cjpoVar;
        eyfy.registerDefaultInstance(cjpo.class, cjpoVar);
    }

    private cjpo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0004\u0007Ȉ\bȈ\t\u0007\nȈ\u000bဉ\u0000\f\u0004\rȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new cjpo();
        }
        if (ordinal == 4) {
            return new cjpn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = p;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjpo.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
