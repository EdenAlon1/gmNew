package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eska extends eyfy implements eyht {
    public static final eska a;
    private static volatile eyhz r;
    public int b;
    public boolean j;
    public boolean l;
    public int m;
    public boolean n;
    public int o;
    public long p;
    public eskc q;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public eyee i = eyee.b;
    public String k = "";

    static {
        eska eskaVar = new eska();
        a = eskaVar;
        eyfy.registerDefaultInstance(eska.class, eskaVar);
    }

    private eska() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007Ȉ\b\u0007\t\f\n\u0007\u000b\u0004\f\u0002\rဉ\u0000\u000eȈ\u000f\n", new Object[]{"b", "c", "f", "g", "h", "j", "k", "d", "l", "m", "n", "o", "p", "q", "e", "i"});
        }
        if (ordinal == 3) {
            return new eska();
        }
        if (ordinal == 4) {
            return new esjz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = r;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eska.class) {
            eyhzVar = r;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                r = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
