package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eset extends eyfy implements eyht {
    public static final eset a;
    private static volatile eyhz u;
    public int b;
    public int c;
    public esff d;
    public esff f;
    public int g;
    public int j;
    public int k;
    public int l;
    public esfd m;
    public int n;
    public esfb o;
    public int p;
    public esez q;
    public esex r;
    public esev t;
    public String e = "";
    public String h = "";
    public String i = "";
    public String s = "";

    static {
        eset esetVar = new eset();
        a = esetVar;
        eyfy.registerDefaultInstance(eset.class, esetVar);
    }

    private eset() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0012\u0000\u0001\u0001\u0018\u0012\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003Ȉ\u0004ဉ\u0001\u0005\f\u0006Ȉ\u0007\f\b\u0004\t\f\nဉ\u0002\u000b\u0004\fဉ\u0003\r\f\u000eဉ\u0004\u0010ဉ\u0006\u0011Ȉ\u0014ဉ\b\u0018Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "i"});
        }
        if (ordinal == 3) {
            return new eset();
        }
        if (ordinal == 4) {
            return new eses();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = u;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eset.class) {
            eyhzVar = u;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                u = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
