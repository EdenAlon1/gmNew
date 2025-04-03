package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqb extends eyfy<cvqb, cvqa> implements eyht {
    public static final cvqb a;
    private static volatile eyhz f;
    public int d;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        cvqb cvqbVar = new cvqb();
        a = cvqbVar;
        eyfy.registerDefaultInstance(cvqb.class, cvqbVar);
    }

    private cvqb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cvqb();
        }
        if (ordinal == 4) {
            return new cvqa();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvqb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
