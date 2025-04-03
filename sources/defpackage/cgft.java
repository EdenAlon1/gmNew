package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgft extends eyfy implements eyht {
    public static final cgft a;
    private static volatile eyhz p;
    public int b;
    public int c;
    public eyja d;
    public int e;
    public int f;
    public eyja g;
    public int h;
    public int i;
    public boolean j;
    public eyja k;
    public boolean l;
    public eyja m;
    public boolean n;
    public eyja o;

    static {
        cgft cgftVar = new cgft();
        a = cgftVar;
        eyfy.registerDefaultInstance(cgft.class, cgftVar);
    }

    private cgft() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", cgfr.a, "d", "e", cgfn.a, "f", cgfp.a, "g", "h", cgfl.a, "i", "j", "k", "l", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new cgft();
        }
        if (ordinal == 4) {
            return new cgfk();
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
        synchronized (cgft.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
