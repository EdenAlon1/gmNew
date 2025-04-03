package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnb extends eyfy implements eyht {
    public static final fbnb a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public eyee d = eyee.b;
    public fbhu e;
    public fbii f;

    static {
        fbnb fbnbVar = new fbnb();
        a = fbnbVar;
        eyfy.registerDefaultInstance(fbnb.class, fbnbVar);
    }

    private fbnb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fbnb();
        }
        if (ordinal == 4) {
            return new fbna();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbnb.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
