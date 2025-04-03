package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpc extends eyfy implements eyht {
    public static final eqpc a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        eqpc eqpcVar = new eqpc();
        a = eqpcVar;
        eyfy.registerDefaultInstance(eqpc.class, eqpcVar);
    }

    private eqpc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eqpc();
        }
        if (ordinal == 4) {
            return new eqpb();
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
        synchronized (eqpc.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
