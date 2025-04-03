package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezma extends eyfy implements eyht {
    public static final ezma a;
    private static volatile eyhz q;
    public int b;
    public int c;
    public int d;
    public int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int p;
    public String e = "";
    public String f = "";
    public String h = "";
    public String o = "";

    static {
        ezma ezmaVar = new ezma();
        a = ezmaVar;
        eyfy.registerDefaultInstance(ezma.class, ezmaVar);
    }

    private ezma() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u000f\u0000\u0000\u0001\u0012\u000f\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\t\u0004\n\u0004\u000b\u0004\f\u0004\r\f\u0010\f\u0011Ȉ\u0012\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        }
        if (ordinal == 3) {
            return new ezma();
        }
        if (ordinal == 4) {
            return new ezlx();
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
        synchronized (ezma.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
