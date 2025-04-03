package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqqb extends eyfy implements eyht {
    public static final eqqb a;
    private static volatile eyhz g;
    public int b;
    public eyee c = eyee.b;
    public boolean d;
    public boolean e;
    public int f;

    static {
        eqqb eqqbVar = new eqqb();
        a = eqqbVar;
        eyfy.registerDefaultInstance(eqqb.class, eqqbVar);
    }

    private eqqb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", eqqa.a});
        }
        if (ordinal == 3) {
            return new eqqb();
        }
        if (ordinal == 4) {
            return new eqpz();
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
        synchronized (eqqb.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
