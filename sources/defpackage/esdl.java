package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esdl extends eyfy implements eyht {
    public static final esdl a;
    private static volatile eyhz d;
    public String b = "";
    public boolean c;

    static {
        esdl esdlVar = new esdl();
        a = esdlVar;
        eyfy.registerDefaultInstance(esdl.class, esdlVar);
    }

    private esdl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new esdl();
        }
        if (ordinal == 4) {
            return new esdk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esdl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
