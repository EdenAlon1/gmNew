package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqqt extends eyfy implements eyht {
    public static final eqqt a;
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
        eqqt eqqtVar = new eqqt();
        a = eqqtVar;
        eyfy.registerDefaultInstance(eqqt.class, eqqtVar);
    }

    private eqqt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006\bဇ\u0007\tဉ\b\nဇ\t\u000bဉ\n\fဇ\u000b\rဉ\f", new Object[]{"b", "c", eqqs.a, "d", "e", eqqq.a, "f", eqqr.a, "g", "h", eqqp.a, "i", "j", "k", "l", "m", "n", "o"});
        }
        if (ordinal == 3) {
            return new eqqt();
        }
        if (ordinal == 4) {
            return new eqqo();
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
        synchronized (eqqt.class) {
            eyhzVar = p;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                p = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
