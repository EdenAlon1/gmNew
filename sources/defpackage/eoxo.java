package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoxo extends eyfy implements eyht {
    public static final eoxo a;
    private static volatile eyhz q;
    public int b;
    public eosl c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public ephj i;
    public boolean j;
    public int k;
    public ephg l;
    public eoze m;
    public boolean n;
    public boolean o;
    public boolean p;

    static {
        eoxo eoxoVar = new eoxo();
        a = eoxoVar;
        eyfy.registerDefaultInstance(eoxo.class, eoxoVar);
    }

    private eoxo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eoyg.a;
            return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\tဉ\u0007\nဇ\b\u000b᠌\t\fဉ\n\rဉ\u000b\u000eဇ\f\u000fဇ\r\u0010ဇ\u000e", new Object[]{"b", "c", "d", eyggVar, "e", eyggVar, "f", eokr.a, "g", eoxl.a, "h", eokm.a, "i", "j", "k", eoxm.a, "l", "m", "n", "o", "p"});
        }
        if (ordinal == 3) {
            return new eoxo();
        }
        if (ordinal == 4) {
            return new eoxk();
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
        synchronized (eoxo.class) {
            eyhzVar = q;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                q = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
