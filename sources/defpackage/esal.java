package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esal extends eyfy implements eyht {
    public static final esal a;
    private static volatile eyhz t;
    public int b;
    public esao c;
    public boolean g;
    public escu h;
    public boolean i;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public boolean p;
    public int q;
    public int r;
    public esay s;
    public String d = "";
    public String e = "";
    public String f = "";
    public String j = "";
    public String o = "";

    static {
        esal esalVar = new esal();
        a = esalVar;
        eyfy.registerDefaultInstance(esal.class, esalVar);
    }

    private esal() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0002\b\u0007\nȈ\u000b\u0007\f\u0007\r\u0004\u000e\f\u000fȈ\u0010\u0007\u0013\f\u0014\f\u0015ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
        }
        if (ordinal == 3) {
            return new esal();
        }
        if (ordinal == 4) {
            return new esak();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = t;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esal.class) {
            eyhzVar = t;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                t = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
