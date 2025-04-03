package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eost extends eyfy implements eyht {
    public static final eost a;
    private static volatile eyhz k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public eygr i = emptyProtobufList();
    public boolean j;

    static {
        eost eostVar = new eost();
        a = eostVar;
        eyfy.registerDefaultInstance(eost.class, eostVar);
    }

    private eost() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001᠌\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t\u001b\nဇ\b", new Object[]{"b", "c", eqwe.a, "d", eosp.a, "e", eoso.a, "f", eosn.a, "g", eosq.a, "h", eosm.a, "i", eqwo.class, "j"});
        }
        if (ordinal == 3) {
            return new eost();
        }
        if (ordinal == 4) {
            return new eoss();
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
        synchronized (eost.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
