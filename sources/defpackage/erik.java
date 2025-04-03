package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erik extends eyfy implements eyht {
    public static final erik a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int e;
    public boolean g;
    public long h;
    public long i;
    public String d = "";
    public String f = "";
    public String j = "";

    static {
        erik erikVar = new erik();
        a = erikVar;
        eyfy.registerDefaultInstance(erik.class, erikVar);
    }

    private erik() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\bဂ\u0007\tဈ\b", new Object[]{"b", "c", erjy.a, "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new erik();
        }
        if (ordinal == 4) {
            return new erij();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erik.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
