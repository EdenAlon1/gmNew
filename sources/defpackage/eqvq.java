package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvq extends eyfy implements eyht {
    public static final eqvq a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public String f = "";
    public String g = "";

    static {
        eqvq eqvqVar = new eqvq();
        a = eqvqVar;
        eyfy.registerDefaultInstance(eqvq.class, eqvqVar);
    }

    private eqvq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", eqvp.a, "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eqvq();
        }
        if (ordinal == 4) {
            return new eqvo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqvq.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
