package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomn extends eyfy implements eyht {
    public static final eomn a;
    private static volatile eyhz o;
    public int b;
    public int c;
    public int d;
    public eoqk e;
    public int f;
    public eoml g;
    public epbu i;
    public epbs j;
    public epbz k;
    public eqfo l;
    public eqrm m;
    public String h = "";
    public String n = "";

    static {
        eomn eomnVar = new eomn();
        a = eomnVar;
        eyfy.registerDefaultInstance(eomn.class, eomnVar);
    }

    private eomn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007\nဉ\t\rဉ\f\u000eဉ\r\u000fဈ\u000e", new Object[]{"b", "c", eomi.a, "d", eomm.a, "e", "f", eqwe.a, "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (ordinal == 3) {
            return new eomn();
        }
        if (ordinal == 4) {
            return new eomj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = o;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eomn.class) {
            eyhzVar = o;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                o = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
