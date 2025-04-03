package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoyv extends eyfy implements eyht {
    public static final eoyv a;
    private static volatile eyhz k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public eohv i;
    public int j;

    static {
        eoyv eoyvVar = new eoyv();
        a = eoyvVar;
        eyfy.registerDefaultInstance(eoyv.class, eoyvVar);
    }

    private eoyv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဉ\u0006\b᠌\u0007", new Object[]{"b", "c", "d", eoyr.a, "e", eoyu.a, "f", "g", eoia.a, "h", fagg.a, "i", "j", epkk.a});
        }
        if (ordinal == 3) {
            return new eoyv();
        }
        if (ordinal == 4) {
            return new eoyt();
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
        synchronized (eoyv.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
